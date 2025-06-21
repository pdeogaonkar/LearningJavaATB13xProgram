package ReverseString;

public class ReverseStringPrac {
    public static void main(String[] args) {

        String myString = "Hello World";
        String reversedString = reverseString(myString);
        System.out.println("Original String: " + myString);
        System.out.println("Reversed String: " + reversedString);

    }


    public static String reverseString(String originalString) {
        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse(); // Reverses the characters in the StringBuilder
        return sb.toString(); // Converts the StringBuilder back to a String
    }

