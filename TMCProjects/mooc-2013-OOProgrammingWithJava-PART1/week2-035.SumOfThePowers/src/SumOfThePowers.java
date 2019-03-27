
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=0, number, powerSum=0;
        System.out.println("Type a number:");
        number = Integer.parseInt(reader.nextLine());
        while(i<=number){
            powerSum += (int) Math.pow(2,i);
            i++;
        }
        System.out.println("The result is " + powerSum);
    }
}
