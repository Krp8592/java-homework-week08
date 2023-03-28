package programmeweek08;

public class EvenDigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of even digits within the number : " + evenDigitSum(123456789));
        System.out.println("The sum of even digits within the number : " +evenDigitSum(252));
        System.out.println("The sum of even digits within the number : " +evenDigitSum(5454));
    }

    public static int evenDigitSum(int num) {
        int inputNumber = num;
        int dgt;
        int sum = 0;

        if (num >= 0) {
            while (num > 0) {
                dgt = num % 10;
                if (dgt % 2 == 0) {
                    sum += dgt;
                }
                num /= 10;
            }
            return sum;
        }
        System.out.println(" Invalid number ");
        return -1;
    }
}
