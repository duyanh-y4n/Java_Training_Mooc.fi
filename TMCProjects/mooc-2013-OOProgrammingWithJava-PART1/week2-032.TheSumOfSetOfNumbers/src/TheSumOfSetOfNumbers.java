
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number, i=1, sum=0;
        System.out.println("Until what? ");
        number = Integer.parseInt(reader.nextLine());
        while (i<=number){
            sum+=i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
