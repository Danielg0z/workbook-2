package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cellphone myPhone = new Cellphone();

        System.out.println("What is the Serial Number? ");
        String sN = myScanner.nextLine();

        System.out.println("What is the Model? ");
        String model = myScanner.nextLine();

        System.out.println("What is the Carrier? ");
        String carrier = myScanner.nextLine();

        System.out.println("What is the Phone Number? ");
        String pN = myScanner.nextLine();

        System.out.println("What is the Owner? ");
        String owner = myScanner.nextLine();

        //set the cellphone data to the object
        myPhone.setSerialNumber(Integer.parseInt(sN));
        myPhone.setModel(model);
        myPhone.setPhoneNumber(pN);
        myPhone.setOwner(owner);

        //use the getters to Display this Information
//        System.out.println("SN: " + myPhone.getSerialNumber());
//        System.out.println("model: " + myPhone.getModel());
//        System.out.println("Carrier: " + myPhone.getCarrier());
//        System.out.println("Phone number: " + myPhone.getPhoneNumber());
//        System.out.println("Owner: " + myPhone.getOwner());

        //Create a second phone
        Cellphone otherPhone = new Cellphone();
        otherPhone.setPhoneNumber("911-123-0987");
        otherPhone.setOwner("Kevin Durant");


        display(myPhone);
        display(otherPhone);

        myPhone.dial(otherPhone.getPhoneNumber());
        otherPhone.dial(myPhone.getPhoneNumber());


    }

    public static void display(Cellphone myPhone) {
        System.out.println("SN: " + myPhone.getSerialNumber());
        System.out.println("model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }

}
