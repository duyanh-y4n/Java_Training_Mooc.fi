import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            String temp;
            System.out.println("Type a word");
            temp = reader.nextLine();
            if (temp.isEmpty() == false) words.add(temp);
            else break;
        }
        System.out.println("You typed the following words:");
        for (String word:words) {
            System.out.println(word);
        }
    }
}
