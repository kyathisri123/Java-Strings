package Strings;

public class StringComparisons {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        System.out.println("Starts with 'He': " + str1.startsWith("He"));
        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));
        System.out.println("CompareTo result: " + str1.compareTo(str2));
    }
}

