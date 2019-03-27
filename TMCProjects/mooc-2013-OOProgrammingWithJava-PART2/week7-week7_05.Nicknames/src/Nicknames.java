
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> Nicknames = new HashMap<String, String>();
        Nicknames.put("matti", "mage");
        Nicknames.put("mikael", "mixu");
        Nicknames.put("arto", "arppa");
        System.out.println(Nicknames.get("mikael"));
    }

}
