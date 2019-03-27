
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;
        // Type your program here
        System.out.println("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
        if (age<18) System.out.println("You have not reached the age of majority zet!");
        else System.out.println("You have reached the age of majority");
    }
}
