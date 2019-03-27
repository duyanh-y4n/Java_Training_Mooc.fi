import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        System.out.println("Type your name: ");
        input=reader.nextLine();
        System.out.println("First charater: " + firstCharacter(input));
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
