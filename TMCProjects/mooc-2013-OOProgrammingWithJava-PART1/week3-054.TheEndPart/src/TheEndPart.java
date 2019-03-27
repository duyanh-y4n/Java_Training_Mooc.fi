import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int in;
        String text;
        System.out.println("Type a word: ");
        text = reader.nextLine();
        System.out.println("Length of end part: ");
        in = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + text.substring(text.length()-in));
    }
}
