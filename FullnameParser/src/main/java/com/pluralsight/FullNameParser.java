package com.pluralsight;
 import java.util.Scanner;
public class FullNameParser {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = "";
        String firstName = "";
        String middleName = "";
        //String noMiddleName = "(none)";
        String lastName = "";
        String[] fullName;

        // if they don't enter a middle name print none


        System.out.println("Enter your name: ");
        name = myScanner.nextLine().trim();

        String[] namePieces = name.split(" ");

        // split Name into first, middle, and last
        if (namePieces.length == 3) {
            //Output pieces
            System.out.println("First Name: " + namePieces[0]);
            System.out.println("Middle Name: " +  namePieces[1]);
            System.out.println("Last Name: " +  namePieces[2]);
        }

        //output piece w/o middle
        if (namePieces.length == 2) {
            System.out.println("First Name: " + namePieces[0]);
            System.out.println("Last Name: " +  namePieces[1]);

        }

        }
    }
