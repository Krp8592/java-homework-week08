package programmeweek08;

import java.util.Scanner;

public class TriangleWithNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows :");
        int n = sc.nextInt();
        int a, b;

        for (a = 1; a <= n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}
