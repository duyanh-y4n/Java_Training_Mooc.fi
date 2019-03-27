
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int in;
        String text;
        System.out.println("Type a word: ");
        text = reader.nextLine();
        System.out.println("Length of first part: ");
        in = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + text.substring(0,in));
    }
}
