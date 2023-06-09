package programmeweek08;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstAndLastDigitSumChallenge {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }
        return (number + lastDigit);
    }

    public static void main(String[] args) {

        System.out.println("Sum of last two digit of number 252 is : " + (sumFirstAndLastDigit(252)));
        System.out.println("Sum of last two digit of number 257 is : " + (sumFirstAndLastDigit(257)));
        System.out.println("Sum of last two digit of number o is : " + (sumFirstAndLastDigit(0)));
        System.out.println("Sum of last two digit of number 5 is : " + (sumFirstAndLastDigit(5)));
        System.out.println("Sum of last two digit of number -10 is : " + (sumFirstAndLastDigit(-10)));

    }
}
