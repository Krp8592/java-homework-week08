package programmeweek08;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */

public class MinAndMaxInputChallenge {

    /**
     * Declare main method with scanner object and ask user to input number in the console
     * And declare if condition to print min amd max value from console when not Integer value is
     * entered.
     */
    public static void main(String[] args) {
        int min;
        int max;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i < min) min = i;
            if (i > max) max = i;

        }

        System.out.println("Minimum input number is " + min);
        System.out.println("Maximum input number is " + max);

        sc.close();
    }

}
