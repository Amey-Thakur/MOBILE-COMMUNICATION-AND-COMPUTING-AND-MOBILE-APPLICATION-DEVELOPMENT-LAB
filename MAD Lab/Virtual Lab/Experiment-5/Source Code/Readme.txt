================================================================================
    EXPERIMENT 5: WAP FORM VALIDATION
    Mobile Application Development Lab
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          WML Form with Validation using WMLScript
Experiment:     Experiment 5 - Write a program using WML to display user form
                with validation for WAP-enabled phones.
Date:           August 20, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Software Used:  WinWAP Simulator for Windows

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
Write a program using WML (Wireless Markup Language) to display a user registration
form with validation (using WMLScript) for WAP-enabled phones.

FILES:
- Validation.wml : WML file containing the Registration Form UI.
- Validate.wmls  : WMLScript file containing the validation logic.

INSTRUCTIONS:
1.  Open the WinWAP Simulator (or any WAP browser).
2.  Open the file "Validation.wml".
3.  Fill in the form details (First Name, Last Name, Password, Email, etc.).
4.  Click "Submit Form Data".
5.  The WMLScript will validate the inputs:
    - Check for empty fields.
    - Check minimum password length (8 characters).
    - If valid, a "Thank You" message/card is displayed.

================================================================================
QUIZ & CURIOSITY
================================================================================

Q1. Differentiate between HTML and WML.

    HTML (HyperText Markup Language):
    - Designed for desktop computers with large screens and high bandwidth.
    - Uses rich formatting and layout features.
    - Not suitable for limited resources of mobile devices.
    - Images: JPEG, PNG, GIF.
    - Not case-sensitive (mostly).

    WML (Wireless Markup Language):
    - Designed for wireless devices with small screens and low bandwidth (WAP).
    - Uses "Cards" and "Decks" metaphor.
    - Optimized for limited power and memory.
    - Images: WBMP (Wireless Bitmap).
    - Case-sensitive (XML-based).

Q2. Explain the use of WMLScript.

    - WMLScript is the client-side scripting language for WML (similar to JavaScript for HTML).
    - It is used to validate user input before sending it to the server calculation,
      saving bandwidth and reducing server load.
    - It can access device facilities (like phone functions).
    - WMLScript is compiled into bytecode before being sent to the WAP client 
      (unlike JavaScript which is sent as source).

================================================================================
NOTE ON DIRECTORY CONTENTS
================================================================================
This directory may contain additional files (JAR, JNLP, HTML) related to other
experiments (e.g. SINR Beam Tilt) preserved from the original repository structure.
For Experiment 5 (WAP), only use 'Validation.wml' and 'Validate.wmls'.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | Terna Engineering College
================================================================================