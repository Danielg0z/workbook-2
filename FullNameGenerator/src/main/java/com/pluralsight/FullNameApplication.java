package com.pluralsight;
import  java.util.Scanner;

public class FullNameApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your name");

        //First name
        System.out.println("First Name: ");
        String firstName = myScanner.nextLine();

        //Middle name:
        System.out.println("Middle Name: ");
        String middleName = myScanner.nextLine();

        //Last name:
        System.out.println("Last Name: ");
        String lastName = myScanner.nextLine();

        //Suffix:
        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine();

        //Display Full Name
        String fullName = "";

        if(firstName.length() > 0){
            fullName += firstName;
        }

        if(middleName.length() > 0){
            fullName += " " + middleName;
        }

        if(lastName.length() > 0){
            fullName += " " + lastName;
        }

        if(suffix.length() > 0){
            fullName += ", " + suffix;
        }

        System.out.println("Full Name: " + fullName);


    }
}
