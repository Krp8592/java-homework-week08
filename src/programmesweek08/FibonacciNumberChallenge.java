package programmeweek08;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciNumberChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number till where to print Fibonacci Sequence till : ");
        int n = sc.nextInt();
        int i = 1, n1 = 1, n2 = 1;
        System.out.println("Fibonacci sequence is : ");
        while (i <= n) {
            System.out.print(n1 + ", ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            i++;
        }

    }

}
