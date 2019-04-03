import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> list;
    private double maxWeight;

    public Box(double maxWeight) {
        this.list = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored toBeStored) {
        if (this.weight() + toBeStored.weight() <= this.maxWeight) this.list.add(toBeStored);
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item :
                this.list) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.list.size() + " things, total weight " + this.weight() + " kg";
    }
}
