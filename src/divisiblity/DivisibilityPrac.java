package divisiblity;

import java.util.Scanner;

public class DivisibilityPrac {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        scanner.close();


            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("not divisile by 3 and 5 "+n);
            }

    }
}
