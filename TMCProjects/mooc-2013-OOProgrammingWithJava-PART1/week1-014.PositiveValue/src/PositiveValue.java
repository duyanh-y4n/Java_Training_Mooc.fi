
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;

        // Type your program here:
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println("The number is" + (number>0?" ":" not ") + "positive.");
    }
}
