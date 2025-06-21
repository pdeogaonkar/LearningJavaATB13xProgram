package calculator;

import java.util.Scanner;

public class calculatorPrac {
    public static void main(String[] args) {


        int num1, num2, result;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  first no");
        num1 = scanner.nextInt();


        System.out.println("Enter  operator");
        operator = scanner.next().charAt(0);


        System.out.println("Enter  second no");
        num2 = scanner.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) { // Handle division by zero
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }

}