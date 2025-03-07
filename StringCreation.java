package Strings;

public class StringCreation {
    public static void main(String[] args) {
        String str1 = "Hello"; // Using string literal
        String str2 = new String("World"); // Using new keyword
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray); // Using character array

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}

