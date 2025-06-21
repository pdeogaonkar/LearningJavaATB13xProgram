package TernaryOperator;

import java.lang.management.ManagementFactory;

public class Maxfrom3numbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int c = 25;

        int result =  (a > b) ? ((a > c) ? a :c) : ((b > c) ? b : c);

        System.out.println("largest is" +result);


    }

}
