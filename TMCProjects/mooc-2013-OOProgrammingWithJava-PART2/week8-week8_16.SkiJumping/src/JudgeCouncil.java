import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JudgeCouncil {
    private ArrayList<Integer> points;
    private Random random;

    public JudgeCouncil(){
        this.points = new ArrayList<Integer>();
        this.random = new Random();
    }

    public void genPointVotes(int numberOfJudges){
        this.points.clear();
        for (int i = 0; i < numberOfJudges; i++) {
            points.add(this.random.nextInt(11)+10);
        }
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public int getJudgesPointsFromVotes(ArrayList<Integer> votes){
        Collections.sort(votes);
        int result = 0;
        for (int i = 1; i < votes.size()-1; i++) {
            result+= votes.get(i);
        }
        return result;
    }

}
