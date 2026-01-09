================================================================================
    EXPERIMENT 9: ANDROID FORM VALIDATION
    Mobile Application Development Lab
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Android Form Validation using Library
Experiment:     Experiment 9
Date:           October 01, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Software Used:  Android Studio
Libraries:      com.mobsandgeeks:android-saripaar:2.0.3

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
Write a program for android phone to display user form and its validation.

FILES INCLUDED:
1.  MainActivity.java:
    - Main Logic for Form Validation.
    - Uses annotations (@NotEmpty, @Length, @Email, etc.) to define rules.
    
2.  activity_main.xml:
    - Layout file containing EditText fields for Username, Password, Email, etc.
    
3.  strings.xml:
    - String resources for labels and error messages.

4.  Experiment-9.avi:
    - Video demonstration of the output (Located in parent directory).

HOW TO RUN:
1.  Create a new project in Android Studio.
2.  Add the dependencies in your `build.gradle` (Module: app) file:

    dependencies {
        implementation 'com.mobsandgeeks:android-saripaar:2.0.3'
        // ... other imports
    }

3.  Copy `strings.xml` to `res/values/strings.xml`.
4.  Copy `activity_main.xml` to `res/layout/activity_main.xml`.
5.  Copy `MainActivity.java` to your java package source path.
    (Note: The package name in the provided file is `android.demo.learnandroidwithrealapps`.
    Adjust it to match your project's package name).
6.  Build and Run the application on an Emulator or Physical Device.

CODE EXPLANATION:
-   Saripaar Library: A powerful, annotation-based form validation library for Android.
-   Annotations:
    -   @NotEmpty: Field cannot be empty.
    -   @Length(min, max): Enforces character length.
    -   @Password: Validates password strength/rules.
    -   @ConfirmPassword: Checks if it matches the password field.
    -   @Email: Validates email format.
    -   @Pattern(regex): Custom regex validation (used for Password and Phone).
    
-   ValidationListener:
    -   `onValidationSucceeded()`: Called when all fields are valid.
    -   `onValidationFailed(List<ValidationError> errors)`: Called when validation fails. 
        Iterates through errors to display messages on respective fields.

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. What are the Android app components?
    1.  Activities: Dictate the UI and handle user interaction.
    2.  Services: Handle background processing associated with an application.
    3.  Broadcast Receivers: Handle communication between Android OS and applications.
    4.  Content Providers: Handle data and database management issues.

Q2. Explain in detail android run time components.
    -   Android Runtime (ART): Executes application code. Preceded by Dalvik.
        Uses Ahead-Of-Time (AOT) compilation.
    -   Core Libraries: Provides standard Java functionality.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | Terna Engineering College
================================================================================
