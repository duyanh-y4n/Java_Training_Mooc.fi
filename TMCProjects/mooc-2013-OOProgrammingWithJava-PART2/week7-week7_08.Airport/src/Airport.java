import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private HashMap<String, Airplane> airplaneList;
    private HashMap<String, Flight> flightList;

    public Airport() {
        this.airplaneList = new HashMap<String, Airplane>();
        this.flightList = new HashMap<String, Flight>();
    }

    public void addNewAirplane(String id, int capacity) {
        Airplane newAirplane = new Airplane(id, capacity);
        this.airplaneList.put(newAirplane.getId(), newAirplane);
    }

    public void addNewFlight(String planeID, String departure, String destination) {
        Airplane usedAirplane = airplaneList.get(planeID);
        if (usedAirplane == null) {
            System.out.println("Airplane not found");
            return;
        } else {
            Flight newFlight = new Flight(usedAirplane, departure, destination);
            this.flightList.put(newFlight.getId(), newFlight);
        }
    }

    public ArrayList<Airplane> getAirplaneList() {
        ArrayList<Airplane> list = new ArrayList<Airplane>();
        for (Airplane airplane :
                this.airplaneList.values()) {
            list.add(airplane);
        }
        return list;
    }

    public ArrayList<Flight> getFlightList() {
        ArrayList<Flight> list = new ArrayList<Flight>();
        for (Flight flight :
                this.flightList.values()) {
            list.add(flight);
        }
        return list;
    }

    public void printPlaneInfo(String planeID) {
        System.out.println(this.airplaneList.get(planeID));
    }
}
