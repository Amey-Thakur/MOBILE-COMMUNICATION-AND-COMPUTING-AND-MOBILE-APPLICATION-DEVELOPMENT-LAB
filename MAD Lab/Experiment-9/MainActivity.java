/*
    Author: Amey Thakur
    Course: Mobile Communication and Computing (MCC) & Mobile Application Development Lab (MAD Lab)
    Semester: VII | Batch: B3 | Roll No: 50
    Experiment: 9 - Android User Form with Validation
    Date: October 01, 2021
    GitHub: https://github.com/Amey-Thakur
    Repository: https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB
*/

package android.demo.learnandroidwithrealapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.Max;
import com.mobsandgeeks.saripaar.annotation.Min;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import com.mobsandgeeks.saripaar.annotation.Url;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        Validator.ValidationListener {
    
    @NotEmpty
    @Length(min = 3, max = 10)
    private EditText editTextUsername;
    
    @NotEmpty
    @Password
    @Pattern(regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
    private EditText editTextPassword;
    
    @ConfirmPassword
    private EditText editTextConfirmPassword;
    
    @NotEmpty
    @Pattern(regex = "^\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$")
    private EditText editTextPhone;
    
    @Min(18)
    @Max(120)
    private EditText editTextAge;
    
    @NotEmpty
    @Email
    private EditText editTextEmail;
    
    @Url
    private EditText editTextWebsite;
    
    @Checked
    private CheckBox checkBoxAgree;
    
    private Button buttonSave;
    private Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        validator = new Validator(this);
        validator.setValidationListener(this);
    }

    private void initView() {
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        editTextAge = findViewById(R.id.editTextAge);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextWebsite = findViewById(R.id.editTextWebsite);
        checkBoxAgree = findViewById(R.id.checkBoxAgree);
        buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSave_onClick(view);
            }
        });
    }

    private void buttonSave_onClick(View view) {
        validator.validate();
        String username = editTextUsername.getText().toString();
        if (username.equalsIgnoreCase("pmk")) {
            editTextUsername.setError(getText(R.string.username_already_exists));
        }
    }

    @Override
    public void onValidationSucceeded() {
        Toast.makeText(this, "We got it right!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            // Display error messages
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
