
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first, second;
        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: ");
        second = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger number of the two numbers given was: " + (first>second?first:second));
    }
}
