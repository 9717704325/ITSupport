package com.OOPSPROJECT1;

import java.util.Random;

public class CredentialService {

    public void generatePassword() {
        String specialCharacters = "!@#$%^&*+_|?><.,~`";
        String Numbers = "0123456789";
        String smallLetters = "abcdefghijklmnopqrstuvqxyz";
        String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        String values = CapitalLetters + smallLetters + Numbers + specialCharacters;


        for (int i = 0; i < 8; i++) {
            char[] password = new char[8];
            Random random = new Random();
            password[i] = values.charAt(random.nextInt(values.length()));


        }

    }
public String generateEmailAddress() {

    String lastname = null;

    String department = "";
    String firstname = "";
    return firstname + lastname + "@" + department + ".abc.com";
}

public void showcredentials(Employee employee, String email, char[] generatePassword) {
    System.out.println("Dear"+ employee.getFirstname() + "your generated credentials are as follows");
    System.out.println("Email -->" + email);
    System.out.println("Password --> 1" + "");
    System.out.println(generatePassword);
}


    public void showcredentials() {
    }
}

