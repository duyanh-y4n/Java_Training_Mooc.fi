import java.util.ArrayList;
import java.util.Scanner;

public class BirdDB {
    private ArrayList<Bird> list;

    public BirdDB(){
        this.list = new ArrayList<Bird>();
    }

    public void add(Scanner input) {
        String name;
        String latinName;
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Latin Name: ");
        latinName = input.nextLine();
        this.list.add(new Bird(name,latinName));
    }

    public void observation(Scanner input) {
        boolean found = false;
        String name;
        System.out.print("What was observed: ? ");
        name = input.nextLine();
        for (Bird bird :
                this.list) {
            if (bird.getName().toUpperCase().contains(name.toUpperCase().trim())) {
                found = true;
                bird.observe();
            }
        }
        if (!found) System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird :
                this.list) {
            System.out.println(bird);
        }
    }

    public void show(Scanner input) {
        String name;
        System.out.print("What? ");
        name = input.nextLine();
        for (Bird bird :
                list) {
            if (bird.getName().toUpperCase().contains(name.toUpperCase().trim())) {
                System.out.println(bird);
            }
        }
    }
}
