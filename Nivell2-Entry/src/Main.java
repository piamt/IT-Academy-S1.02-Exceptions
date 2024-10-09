public class Main {
    public static void main(String[] args) {

        byte value = Entry.readByte("Enter your age:");
        System.out.println("Final value: " + value);

        int value1 = Entry.readInt("Enter your year of born:");
        System.out.println("Final value: " + value1);

        float value2 = Entry.readFloat("Enter your month with numbers (1-12):");
        System.out.println("Final value: " + value2);

        double value3 = Entry.readDouble("Enter your day:");
        System.out.println("Final value: " + value3);

        char value4 = Entry.readChar("Enter char:");
        System.out.println("Final value: " + value4);

        String value5 = Entry.readString("Enter your name and surname:");
        System.out.println("Final value: " + value5);

        boolean value6 = Entry.readYesNo("Enter yes or no:");
        System.out.println("Final value: " + value6);
    }
}