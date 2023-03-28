package programmeweek08;

import java.util.Scanner;

public class DiamondPatternChallenge {

    // Main  method declaration.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to make a Diamond shape : ");
        int number = sc.nextInt();
        int m, n;

        for (m = 1; m <= number; m++) {

            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (m = number - 1; m > 0; m--) {

            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
