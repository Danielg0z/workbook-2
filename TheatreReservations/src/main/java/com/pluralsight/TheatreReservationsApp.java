package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservationsApp {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Print the name of the customer
        System.out.println("Please enter Name:");
        String name = myScanner.nextLine().trim();
        System.out.println("What date will you be coming (MM/dd/yyyy)?");
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // they typed myScanner, then givenDate stores the formatting, and localDate.parse
        // will parse said date into the formatter
        LocalDate givenDate = LocalDate.parse(myScanner.nextLine(), formatter);

        //New Format for the changed output format
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String outputDate = givenDate.format(newFormat);
        System.out.println("How Many Ticket(s) would you like? ");
        int tickets = myScanner.nextInt();

        // for name pieces for placement swap at the end
        String[] namePieces = name.split(" ");
    if 
        if (tickets > 1) {
            System.out.println( tickets + " tickets reserved for " + outputDate + " under " + namePieces[1] + ", " + namePieces[0]);
        } else {
            System.out.println( tickets + " ticket reserved for " + outputDate + " under " + namePieces[1] + ", " + namePieces[0]);
        }

    }
}
