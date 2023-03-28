package programmeweek08;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class ArmstrongNumberChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (isArmStrong(num)) {
            System.out.print(num + " : is an Armstrong");
        } else {
            System.out.print(num + " : is not an Armstrong Number");
        }
    }

    static boolean isArmStrong(int n) {

        int t1, dgt = 0, ln = 0, sum = 0;

        int t = n;

        {
            while (t > 0) {
                t = t / 10;
                dgt++;
            }

            int t2 = n;
            while (t2 > 0) {
                ln = t2 % 10;
                sum += Math.pow(ln, dgt);
                t2 = t2 / 10;
            }

            if (n == sum) {
                return true;
            } else {
                return false;
            }
        }
    }
}
