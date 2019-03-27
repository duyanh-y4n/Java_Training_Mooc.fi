import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String testInput="1\nAY-123\n108\n"
                + "x\n"
                + "1\n"
                + "x\n";
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        AirportUserInterface ui = new AirportUserInterface(scanner, airport);
        ui.start();
    }
}
