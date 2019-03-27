public class Flight {
    private String ID;
    private String departure;
    private String destination;
    private Airplane airplane;

    public Flight(Airplane usedAirplane, String departure, String destination) {
        this.airplane = usedAirplane;
        this.departure = departure;
        this.destination = destination;
        this.ID = this.airplane.getId()+"@"+this.departure+"-"+this.destination;
    }

    public String getId() {
        return this.ID;
    }

    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.destination + ")";
    }
}
