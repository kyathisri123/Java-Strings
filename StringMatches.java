package Strings;

public class StringMatches {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Contains only digits? " + str.matches("\\d+"));
    }
}
