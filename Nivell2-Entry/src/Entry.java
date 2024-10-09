import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class Entry {

    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        byte validInput = 0;
        while(!isValidInput) {
            try {
                validInput = scanner.nextByte();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. " + message);
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return validInput;
    }

    public static int readInt(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        int validInput = 0;
        while(!isValidInput) {
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

    public static float readFloat(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        float validInput = 0;
        while(!isValidInput) {
            try {
                validInput = scanner.nextFloat();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. " + message);
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return validInput;
    }

    public static double readDouble(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        double validInput = 0;
        while(!isValidInput) {
            try {
                validInput = scanner.nextDouble();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. " + message);
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return validInput;
    }

    private static String charReadLineAndCheck() throws CharException {
        String line = scanner.nextLine();
        if (line.length() > 1) throw new CharException("Input has more than 1 char.");
        else if (line.isEmpty()) throw new CharException("Input has no char");
        else return line;
    }

    public static char readChar(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        String line = null;

        while(!isValidInput) {
            try {
                line = charReadLineAndCheck();
                isValidInput = true;
            } catch (CharException e) {
                System.out.println("Format error (" + e.getMessage() + "). " + message);
                scanner.reset();
            }
        }
        return line.charAt(0);
    }

    private static String stringReadLineAndCheck() throws CharException {
        String line = scanner.nextLine();
        if (line.isEmpty()) throw new CharException("Input has no String");
        else return line;
    }

    public static String readString(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        String line = null;

        while(!isValidInput) {
            try {
                line = stringReadLineAndCheck();
                isValidInput = true;
            } catch (CharException e) {
                System.out.println("Format error (" + e.getMessage() + "). " + message);
                scanner.reset();
            }
        }
        return line;
    }

    private static String yesNoReadLineAndCheck() throws CharException {
        String line = scanner.nextLine();
        if (!line.equals("y") && !line.equals("n")) throw new CharException("Invalid input. Allowed values: y or n");
        else return line;
    }

    public static boolean readYesNo(String message) {
        System.out.println(message);
        boolean isValidInput = false;
        String line = null;

        while(!isValidInput) {
            try {
                line = yesNoReadLineAndCheck();
                isValidInput = true;
            } catch (CharException e) {
                System.out.println("Format error (" + e.getMessage() + "). " + message);
                scanner.reset();
            }
        }
        return (line.equals("y")) ? true : false;
    }
}
