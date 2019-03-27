import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first, second;
        System.out.println("Type the first number: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        second = Integer.parseInt(reader.nextLine());
        if (first == second) System.out.println("The numbers are equal!");
        else System.out.println("Greater number: " + (first > second ? first : second));
    }
}