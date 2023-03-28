package programmeweek08;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit, so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 */

public class DigitSumChallenge {

    //Declare a static method and provide logic to sum of the digit of numbers
    public static int sumDigit(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        return sum;
    }

    //Declare a main method with print statement calling static method with numbers as parameters
    //to be calculated as per their digits.
    public static void main(String[] args) {

        System.out.println("Sum of digits of number 67895 = " + sumDigit(67895));
        System.out.println("Sum of digits of number 8560 = " + sumDigit(8560));
        System.out.println("Sum of digits of number 560 = " + sumDigit(560));
        System.out.println("Sum of digits of number -23 = " + sumDigit(-23));


    }
}
