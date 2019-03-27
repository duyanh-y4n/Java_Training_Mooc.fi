import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String in;
        System.out.println("Type your name: ");
        in = reader.nextLine();
        System.out.print("In reverse order: ");
        for (int i = 0; i < in.length(); i++) {
            System.out.print(in.charAt(in.length()-1-i));
        }
    }
}
