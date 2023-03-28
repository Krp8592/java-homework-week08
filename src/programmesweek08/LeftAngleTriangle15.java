package programmesweek08;

import java.util.Scanner;

public class LeftAngleTriangle {

    public static void main(String[] args) {
        // Scanner object to determine size of the triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the triangle to display : ");
        int size = sc.nextInt();
        // loop to print the pattern
        int i;
        for (i = 0; i < size; i++) {

            // print spaces
            for (int j = 2 * (size - i); j >= 6; j--){
                     System.out.print(" ");
        }
        // print stars
        for (int k = 0; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
        }

        sc.close();//Close scanner object
    }

}

