
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while(true) {
            String temp;
            System.out.println("Type a word");
            temp = reader.nextLine();
            if(temp.isEmpty())
                break;
            else
                words.add(temp);
        }
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String word: words) {
            System.out.println(word);
        }
    }
}
