
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstName, secondName;
        int firstAge, secondAge;

        // Implement your program here
        System.out.println("Type your name: ");
        firstName = reader.nextLine();
        System.out.println("Type your age: ");
        firstAge = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println("Type your name: ");
        secondName = reader.nextLine();
        System.out.println("Type your age: ");
        secondAge = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println(firstName + " and " + secondName + " are " + (firstAge+secondAge) + "years old in total.");

    }
}
