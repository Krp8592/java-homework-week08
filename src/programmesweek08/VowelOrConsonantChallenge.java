package programmesweek08;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class VowelOfConsonantChallenge {

    //Declare a main method with scanner object to provide a character.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Declare scanner object
        System.out.print("Please provide a single character : ");//Print statement to get entered any character
        String a = sc.next().toLowerCase();//Declare variable to store value of entered character.
        VowelOfConsonantChallenge obj = new VowelOfConsonantChallenge();//Create object of a class
        obj.alphabet(a);//Call instance method

        sc.close();//Close scanner object
    }

    //Define a method to provide logic to determine if the entered character is vowel,
    //consonant or invalid input.
    public void alphabet(String a) {
        //If statement to define condition if the character is vowel or consonant or invalid input.
        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
            System.out.println("Entered character is Vowel.");//Print statement
        } else if (a.length() > 1) {
            System.out.println("Invalid input. ");//Print statement
        } else {
            System.out.println("Entered Character is Consonant");//Print statement
        }
    }
}
