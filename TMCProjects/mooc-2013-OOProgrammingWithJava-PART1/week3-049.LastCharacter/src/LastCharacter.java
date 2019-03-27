import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        System.out.println("Type your name:");
        input=reader.nextLine();
        System.out.println("Last character: " + lastCharacter(input));
    }
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
