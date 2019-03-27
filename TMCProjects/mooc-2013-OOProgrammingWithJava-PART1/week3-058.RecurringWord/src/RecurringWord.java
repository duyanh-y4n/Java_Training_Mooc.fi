
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            String temp;
            System.out.println("Type a word:");
            temp=reader.nextLine();
            if (words.contains(temp)==false) words.add(temp);
            else {
                System.out.println("You gave the word "  + temp + " twice");
                break;
            }
        }
    }
}
