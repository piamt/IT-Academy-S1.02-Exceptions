package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        int validInput = 0;
        while (!isValidInput) {
            try {
                validInput = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. " + message);
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return validInput;
    }

    public static String readString(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        String validInput = null;
        while (!isValidInput) {
            try {
                validInput = scanner.nextLine();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. " + message);
                scanner.nextLine();
            }
        }
        scanner.reset();
        return validInput;
    }
}