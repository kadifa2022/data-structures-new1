package com.cydeo.javaCoreMuhtar;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Cydeo123!";

        //write your code here

        if(password.contains(" ")){
            System.out.println("Invalid  password");
            return;
        }
        boolean hasAtLeast8Characters = password.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        for (int i =0; i<password.length(); i++){
           char ch =  password.charAt(i);

           if(Character.isUpperCase(ch)){
               hasUpperCase = true;
           } else if (Character.isLowerCase(ch)) {
               hasLowerCase = true;
           } else if (Character.isDigit(ch)) {
               hasDigit = true;
           }else {
               hasSpecialCharacter = true;
           }
        }
        boolean isStrongPassword = hasAtLeast8Characters && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;

        if(isStrongPassword) {
            System.out.println(password + "is strong password");
        }else{
            System.out.println(password + " is not strong password");
        }



    }
}
/*
Write a program that can determine whether the given password is a strong password.
Characteristics of strong password typically include:
1. Password should be at least 8 characters
2. Password should contain at least one uppercase letter
3. Password should contain at least one lowercase letter
4. Password should contain at least one digit character
5. Password should contain at leas one special character

In addition, a valid password should not include whitespaces

Ex:

password = "Cydeo123!"
 */