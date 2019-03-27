
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String inputText;
        // Write your code here
        do {
            System.out.println("Type the password: ");
            inputText = reader.nextLine();
            System.out.println((inputText.equals(password)?"Right!":"Wrong!"));
        } while (inputText.equals(password)==false);
        System.out.println("The secret is: jryy qbar!");
    }
}
