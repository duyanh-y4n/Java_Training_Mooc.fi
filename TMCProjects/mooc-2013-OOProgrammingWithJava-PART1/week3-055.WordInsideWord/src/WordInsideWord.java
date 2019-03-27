
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String first, second;
        System.out.println("Type the first word: ");
        first = reader.nextLine();
        System.out.println("Type the second word: ");
        second = reader.nextLine();
        System.out.println("The word " + second + " is" + (first.indexOf(second) == -1 ? " not " : " ") + "found in the word " + first);
    }
}
