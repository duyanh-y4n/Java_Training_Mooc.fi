import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        BirdDB birds = new BirdDB();
        String option;
        printMenu();
        while (true) {
            System.out.print("? ");
            option = scanner.nextLine();
            if (option.toUpperCase().trim().equals("ADD")) birds.add(scanner);
            else if (option.toUpperCase().trim().equals("OBSERVATION")) birds.observation(scanner);
            else if (option.toUpperCase().trim().equals("STATISTICS")) birds.statistics();
            else if (option.toUpperCase().trim().equals("SHOW")) birds.show(scanner);
            else if (option.toUpperCase().trim().equals("QUIT")) break;
            else printMenu();
        }
    }

    static void printMenu() {
        System.out.println("Add - adds a bird\n" +
                "Observation - adds an observation\n" +
                "Statistics - prints all the birds\n" +
                "Show - prints one bird\n" +
                "Quit - terminates the program\n");
    }
}