import java.util.ArrayList;
import java.util.Random;

public class SkiJumper implements Comparable<SkiJumper>{
    private String name;
    private int points;
    private ArrayList<Integer> jumps;

    public SkiJumper(String name){
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList<Integer>();
    }

    public int getPoints() {
        return this.points;
    }

    public String getName() {
        return this.name;
    }

    public void addJump(int jump){
        this.jumps.add(jump);
    }

    void addPoints(int points){
        this.points+=points;
    }

    public int jump(){
        Random random = new Random();
        int jump = random.nextInt(61)+60;
        this.addJump(jump);
        return jump;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getPoints() + " points)";
    }

    @Override
    public int compareTo(SkiJumper o) {
        return o.getPoints()-this.getPoints();
    }

    public void printJumpLengths(){
        System.out.print("jump lengths: ");
        for (int jump :
                this.jumps) {
            System.out.print(jump + "m" + (this.jumps.indexOf(jump)==this.jumps.size()-1?"\n":","));
        }
    }
}
