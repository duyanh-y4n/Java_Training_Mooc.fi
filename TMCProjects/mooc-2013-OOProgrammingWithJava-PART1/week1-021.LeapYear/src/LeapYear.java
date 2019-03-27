
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year;
        System.out.println("Type a year: ");
        year = Integer.parseInt(reader.nextLine());
        if(year%100==0) {
            System.out.println("The year is"+(year%400==0?" ":" not ")+"a leap year");
        }
        else System.out.println("The year is"+(year%4==0?" ":" not ")+"a leap year");
    }
}
