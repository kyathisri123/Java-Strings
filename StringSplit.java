package Strings;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Apple,Banana,Cherry";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

