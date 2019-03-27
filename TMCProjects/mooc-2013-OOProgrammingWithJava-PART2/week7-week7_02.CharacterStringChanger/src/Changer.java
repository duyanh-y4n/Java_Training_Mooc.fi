import java.util.ArrayList;

public class Changer {
    private int numbOfChange;
    private ArrayList<Change> changes;

    public Changer() {
        this.numbOfChange = 0;
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String s) {
        String result = "" + s;
        for (Change change :
                this.changes) {
            result = change.change(result);
        }
        return result;
    }

}
