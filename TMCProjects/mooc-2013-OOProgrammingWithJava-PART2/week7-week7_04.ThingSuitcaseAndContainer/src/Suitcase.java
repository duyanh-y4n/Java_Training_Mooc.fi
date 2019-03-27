import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Suitcase {
    private ArrayList<Thing> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.list = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) this.list.add(thing);
    }

    @Override
    public String toString() {
        if (this.list.size()==0) return "empty (0 kg)";
        if (this.list.size()==1) return "1 thing (" + this.totalWeight() + " kg)";
        return this.list.size() + " things (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int result = 0;
        for (Thing thing :
                this.list) {
            result += thing.getWeight();
        }
        return result;
    }


    public void printThings() {
        for (Thing thing :
                this.list) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        ArrayList<Thing> sortedList =  (ArrayList<Thing>) this.list.clone();
        if (sortedList.size()>0) {
            Collections.sort(sortedList, new SortByWeight());
            return sortedList.get(sortedList.size()-1);
        }
        else return null;
    }
}


class SortByWeight implements Comparator<Thing>
{
    public int compare(Thing a, Thing b)
    {
        return a.getWeight() - b.getWeight();
    }
}