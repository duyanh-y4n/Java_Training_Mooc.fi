import java.util.Scanner;

public class AirportUserInterface {
    private Scanner scanner;
    private Airport airport;

    public AirportUserInterface(Scanner scanner, Airport airport) {
        this.scanner = scanner;
        this.airport = airport;
    }

    public void start() {
        this.startAirportPanel();
        this.startFlightService();
    }

    private void startFlightService() {
        char option;
        String in;
        this.flightServiceWelcome();
        this.flightServiceMenu();
        while (true) {
            option = getOption();
            if (option == '1') this.printPlanes();
            else if (option == '2') this.printFlights();
            else if (option == '3') this.printPlaneInfo();
            else if (option == 'x') break;
            this.flightServiceMenu();
        }
    }

    private void printPlaneInfo() {
        String in;
        System.out.print("Give plane ID: ");
        in = this.scanner.nextLine();
        this.airport.printPlaneInfo(in);
    }

    private void printFlights() {
        for (Flight flight :
                this.airport.getFlightList()) {
            System.out.println(flight);
        }
    }

    private void printPlanes() {
        for (Airplane airplane :
                this.airport.getAirplaneList()) {
            System.out.println(airplane);
        }
    }

    private void flightServiceMenu() {
        System.out.println("Choose operation:\n" +
                "[1] Print planes\n" +
                "[2] Print flights\n" +
                "[3] Print plane info\n" +
                "[x] Quit");
    }

    private void flightServiceWelcome() {
        System.out.println("Flight service\n" +
                "------------");
    }

    private void startAirportPanel() {
        char option;
        String in;
        this.airportPanelWelcome();
        this.airportMenu();
        while (true) {
            option = getOption();
            if (option == '1') this.addAirplane();
            else if (option == '2') this.addFlight();
            else if (option == 'x') break;
            this.airportMenu();
        }
    }

    private char getOption() {
        String in;
        char option;
        System.out.print("> ");
        do {
            in = this.scanner.nextLine();
            in = in.trim();
        } while (in.isEmpty());
        option = in.charAt(0);
        return option;
    }

    private void addFlight() {
        String planeID, departure, destination;
        System.out.print("Give plane ID: ");
        planeID = this.scanner.nextLine();
        System.out.print("Give departure airport code: ");
        departure = this.scanner.nextLine();
        System.out.print("Give destination airport code: ");
        destination = this.scanner.nextLine();
        this.airport.addNewFlight(planeID, departure, destination);
    }

    private void addAirplane() {
        String ID;
        String in;
        int capacity;
        System.out.print("Give plane ID: ");
        ID = this.scanner.nextLine();
        System.out.print("Give plane capacity: ");
        in = scanner.nextLine();
        while (isInteger(in)==false){
            System.out.println("capacity must be a number");
            in = scanner.nextLine();
        }
        capacity = Integer.parseInt(in);
        this.airport.addNewAirplane(ID, capacity);
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    private void airportMenu() {
        System.out.println("Choose operation:\n" +
                "[1] Add airplane\n" +
                "[2] Add flight\n" +
                "[x] Exit");
    }

    private void airportPanelWelcome() {
        System.out.println("Airport panel\n" +
                "--------------------");
    }
}
