package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab002_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no");
        int a = scanner.nextInt();

        System.out.println("Enter no");
        int b = scanner.nextInt();

        int c = a+b;

        System.out.println("Sum is "+c);

    }
}
