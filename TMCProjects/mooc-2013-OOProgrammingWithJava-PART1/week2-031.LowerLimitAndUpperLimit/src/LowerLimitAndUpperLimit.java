
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first, last;
        // write your code here
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("First: ");
        last = Integer.parseInt(reader.nextLine());
        while (first<=last) {
            System.out.println(first);
            first++;
        }
    }
}
