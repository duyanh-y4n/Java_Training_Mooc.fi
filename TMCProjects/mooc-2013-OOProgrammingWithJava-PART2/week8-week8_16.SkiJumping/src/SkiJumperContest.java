import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SkiJumperContest {
    private Scanner scanner;
    private ArrayList<SkiJumper> skiJumpers;
    private JudgeCouncil judgeCouncil;

    public SkiJumperContest(Scanner scanner) {
        this.scanner = scanner;
        this.skiJumpers = new ArrayList<SkiJumper>();
        this.judgeCouncil = new JudgeCouncil();
    }

    public void startRegisterPhase() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String JumperName = this.scanner.nextLine();
            if (JumperName.isEmpty()) {
                System.out.println();
                break;
            }
            this.skiJumpers.add(new SkiJumper(JumperName));
        }
        System.out.println("The tournament begins!");
        System.out.println();
    }

    public boolean chooseJumpOrQuit() {
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String input = this.scanner.nextLine();
        System.out.println();
        return input.trim().toLowerCase().contains("jump");
    }

    public void startRound(int round) {
        System.out.println("Round " + round);
        System.out.println();
        Collections.sort(this.skiJumpers);
        this.printRoundOrder();
        this.startJumping(round);
    }

    private void startJumping(int round) {
        System.out.println("Results of round " + round);
        for (SkiJumper skiJumper :
                this.skiJumpers) {
            int jumpPoints = skiJumper.jump();
            this.judgeCouncil.genPointVotes(5);
            ArrayList<Integer> judgeVotes = this.judgeCouncil.getPoints();
            int judgePoints = this.judgeCouncil.getJudgesPointsFromVotes(judgeVotes);

            System.out.println("  " + skiJumper.getName());
            System.out.println("    length: " + jumpPoints);
            System.out.println("    judge votes: " + judgeVotes);
            skiJumper.addPoints(jumpPoints + judgePoints);
        }
    }

    public void printRoundOrder() {
        Collections.sort(this.skiJumpers);
        System.out.println("Jumping order:");
        for (int i = 0; i < this.skiJumpers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + this.skiJumpers.get(i));
        }
        System.out.println();
    }

    public void printResult() {
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:\n" +
                "Position    Name");
        for (SkiJumper skiJumper :
                this.skiJumpers) {
            System.out.print(
                    (this.skiJumpers.indexOf(skiJumper)+1)+"           "+skiJumper+"\n" +
                            "            ");
            skiJumper.printJumpLengths();
        }
    }
}
