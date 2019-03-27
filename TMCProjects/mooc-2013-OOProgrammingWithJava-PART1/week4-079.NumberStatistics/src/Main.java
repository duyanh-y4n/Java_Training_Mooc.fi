import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        int numb;
        System.out.println("Type numbers:");
        while (true) {
            numb = Integer.parseInt(reader.nextLine());
            if (numb<0) break;
            else if (numb%2==0) evenStats.addNumber(numb);
            else oddStats.addNumber(numb);
            stats.addNumber(numb);
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
