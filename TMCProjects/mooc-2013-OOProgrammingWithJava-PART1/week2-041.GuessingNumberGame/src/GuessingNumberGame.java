
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int tries = 0;
        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.println("Guess a number: ");
            int input = Integer.parseInt(reader.nextLine());
            tries++;
            if (input==numberDrawn)  {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else System.out.print("The number is " + (input>numberDrawn?"lesser":"greater")+",");
            System.out.println("guesses made: " + tries);
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
