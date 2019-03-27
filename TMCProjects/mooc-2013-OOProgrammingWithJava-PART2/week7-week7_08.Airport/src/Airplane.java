public class Airplane {
    private String ID;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.ID = id;
        this.capacity = capacity;
    }

    public String getId() {
        return this.ID;
    }

    @Override
    public String toString() {
        return this.ID +" (" + this.capacity + " ppl)";
    }
}
