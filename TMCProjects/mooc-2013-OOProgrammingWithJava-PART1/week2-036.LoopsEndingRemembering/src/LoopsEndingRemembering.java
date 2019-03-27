import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number, sum=0, i=0, average, even = 0, odd = 0;
        System.out.println("Type numbers: ");
        while (true){
            number = Integer.parseInt(reader.nextLine());
            if(number<0) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + i);
                System.out.println("Average: " + (1.0*sum/i));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd number: " + odd);
                break;
            }
            else {
                sum+= number;
                i++;
                if(number%2==0) even++;
                else odd++;
                System.out.println(number);
            }
        }

    }
}
