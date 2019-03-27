
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;
        System.out.println("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
        System.out.println((age<0||age>120?"Impossible!":"OK"));
    }
}
