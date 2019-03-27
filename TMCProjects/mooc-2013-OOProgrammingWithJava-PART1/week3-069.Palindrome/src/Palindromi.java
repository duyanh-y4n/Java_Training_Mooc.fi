import java.util.ArrayList;
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String revText = reverse(text);
        return text.equals(revText);
    }

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String temp="";
        for (int i = text.length(); i > 0; i--) {
            temp = temp.concat(text.substring(i-1,i));
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
