package com.pluralsight;

import java.util.Scanner;

public class BuildAnAddress {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Provide the following information:");
        System.out.println("Full Name: (First and Last name Please.");
        String fullName = myScanner.nextLine();
        StringBuilder addressInfo = new StringBuilder();
        StringBuilder shippingInfo = new StringBuilder();

        System.out.println("Billing Street: ");
        String billingStreet = myScanner.nextLine();


        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine();

        System.out.println("----------------------------------------");

        System.out.println("Shipping Street: ");
        String shippingStreet = myScanner.nextLine();


        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

        System.out.println(fullName);

        addressInfo.append("Billing Address:\n ");
        addressInfo.append(billingStreet).append("\n");
        addressInfo.append(" ").append(billingCity).append(", ").append(billingState).append(" ").append(billingZip);


        System.out.println("----------------------------------------");

        shippingInfo.append("\n Shipping Address:\n");
        shippingInfo.append(shippingStreet).append("\n");
        shippingInfo.append(" ").append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        System.out.println(addressInfo);
        System.out.println(shippingInfo);

    }

}