import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        System.out.println("Type your name: ");
        input = reader.nextLine();
        if(input.length()>=3) {
            System.out.println("1. character: " + input.charAt(0));
            System.out.println("2. character: " + input.charAt(1));
            System.out.println("3. character: " + input.charAt(2));
        }
    }
}
