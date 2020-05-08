package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRSTNAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String LASTNAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";
    private static final String MOBILENUMBER_PATTERN="^([0-9]{2})?([1-9]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN="^[0-9a-zA-Z]{8,}$";

     public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRSTNAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname){
         Pattern pattern = Pattern.compile(LASTNAME_PATTERN);
         return pattern.matcher(lname).matches();
    }
    public boolean validateEmailAddress(String email){
         Pattern pattern = Pattern.compile(EMAIL_PATTERN);
         return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String mobilenum){
         Pattern pattern = Pattern.compile(MOBILENUMBER_PATTERN);
         return pattern.matcher(mobilenum).matches();
    }
    public boolean validatePassword(String pwd){
         Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
         return pattern.matcher(pwd).matches();
    }
}
