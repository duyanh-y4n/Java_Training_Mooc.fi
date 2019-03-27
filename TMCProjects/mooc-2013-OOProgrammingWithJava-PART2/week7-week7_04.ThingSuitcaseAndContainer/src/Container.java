import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> list;
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight()+suitcase.totalWeight()<=this.maxWeight)this.list.add(suitcase);
    }

    public void printThings() {
        for (Suitcase suitcase :
                this.list) {
            suitcase.printThings();
        }
    }

    public int totalWeight() {
        int result = 0;
        for (Suitcase suitcase :
                this.list) {
            result += suitcase.totalWeight();
        }
        return result;
    }

    @Override
    public String toString() {
        if (this.list.size()==0) return "empty (0 kg)";
        if (this.list.size()==1) return "1 suitcase (" + this.totalWeight() + " kg)";
        return this.list.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
