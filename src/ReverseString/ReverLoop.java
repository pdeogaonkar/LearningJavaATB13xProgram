package ReverseString;

import java.util.Scanner;

public class ReverLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();


        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            revString = revString + str.charAt(i);
        }

        System.out.println("original string " + str);
        System.out.println("reverse string " + revString);

        // Reverse and print the string


    }
}