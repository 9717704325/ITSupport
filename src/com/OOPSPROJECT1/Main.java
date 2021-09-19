package com.OOPSPROJECT1;

import java.util.Scanner;

public class Main {

    private static Object showcredentials;

    public static void main(String[] args) {

        Employee emp = new Employee("Ritika");
        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide an appropiate option");
        int option = sc.nextInt();


        // write your code here

        CredentialService credentialServiceobj1 = new CredentialService();
        credentialServiceobj1.showcredentials();



    }
}
