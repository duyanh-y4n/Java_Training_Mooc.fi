
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String in;
        System.out.println("Type your name: ");
        in = reader.nextLine();
        for (int i = 0; i < in.length(); i++) {
            System.out.println((i+1)+". character:"+in.charAt(i));
        }
    }
}
