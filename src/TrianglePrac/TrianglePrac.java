package TrianglePrac;

import java.util.Scanner;

public class TrianglePrac {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter side 1");
        int side1 = sc.nextInt();

        System.out.println("Enter side 2");
        int side2 = sc.nextInt();

        System.out.println("Enter side 3");
        int side3 = sc.nextInt();

//        System.out.println("Side1");
//        System.out.println("Side2");
//        System.out.println("Side3");

        if (isValidTriangle(side1, side2, side3)) {
            classifyTriangle(side1, side2, side3);
        } else {
            System.out.println("The given side lengths do not form a valid triangle.");
        }

        sc.close();
    }
    // Method to check if the sides can form a valid triangle
    public static boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }

    // Method to classify the triangle
    public static void classifyTriangle(double s1, double s2, double s3) {
        if (s1 == s2 && s2 == s3) {
            System.out.println("It is an Equilateral Triangle.");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            System.out.println("It is an Isosceles Triangle.");
        } else {
            System.out.println("It is a Scalene Triangle.");
        }
    }


}
