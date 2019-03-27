import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1, number, factorial = 1;
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        while (i<=number){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
