package programmeweek08;

/*
 * Read 10 numbers from the console entered by the user and print the sum if those numbers.
 */

import java.util.Scanner;

/**
 * Create a main method with scanner object and ask user to provide 10 number in console.
 */

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter;
        int num = 0;
        counter = 1;
        while (counter <= 10) {
            System.out.print("Enter Number #" + counter + " : ");
            //HasNextInt() method form the scanner to check if the use has entered an int value.
            boolean i = sc.hasNextInt();
            if (i) {
                num = num + sc.nextInt();
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
        //Call static method into main method
        sumOfNumbers(num);
        //Close scanner object.
        sc.close();
    }

    //Create static method with one param and define formula to get the sum of numbers
    public static void sumOfNumbers(int num) {
        int sum = 0;
        sum += num;
        System.out.println("Sum of entered number is :" + sum);
    }

}

