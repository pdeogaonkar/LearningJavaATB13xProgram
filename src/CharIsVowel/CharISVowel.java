package CharIsVowel;

import java.util.Scanner;

public class CharISVowel {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //char ch = i;
        System.out.println("Enter character");
        char ch = sc.next().toLowerCase().charAt(0);

        System.out.println("Enter character");

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(ch + " is vowel");
        }
        else
            System.out.println(ch + " is consonant");

    }


}


