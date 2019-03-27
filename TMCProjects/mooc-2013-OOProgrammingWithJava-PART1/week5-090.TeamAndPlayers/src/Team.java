import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players;

    public Team(String name){
        this.name = name;
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public void addPlayer(Player player){
        if (this.players.size()<this.maxSize)this.players.add(player);
    }

    public void printPlayers() {
        for (Player player :
                this.players) {
            System.out.println(player);
        }
    }

    public int goals() {
        int sum = 0;
        for (Player player :
                this.players) {
            sum += player.goals();
        }
        return sum;
    }
}
