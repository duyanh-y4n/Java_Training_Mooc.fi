
import java.util.Scanner;
import java.math.*;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int radius;
        // Program your solution here
        System.out.println("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());
        System.out.println("Circumference of the circle: " + (Math.PI*radius*2));
    }
}
