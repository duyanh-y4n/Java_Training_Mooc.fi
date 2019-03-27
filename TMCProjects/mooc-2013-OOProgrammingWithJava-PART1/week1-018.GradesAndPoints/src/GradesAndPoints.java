
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int point;
        String grade;
        System.out.println("Type the points [0-60]: ");
        point = Integer.parseInt(reader.nextLine());
        if(point<30) grade = "failed";
        else if (point<35) grade = "1";
        else if (point<40) grade = "2";
        else if (point<45) grade = "3";
        else if (point<50) grade = "4";
        else grade = "5";
        System.out.println("Grade: " + grade);
    }
}
