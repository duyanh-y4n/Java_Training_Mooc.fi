import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner scanner = new Scanner(System.in);
        Scanner scanner_test = new Scanner("Arto\n\njump\njump\nquit\n");
        SkiJumperContest skiJumperContest = new SkiJumperContest(scanner_test);
        int roundCounter=0;

        skiJumperContest.startRegisterPhase();
        while (true){
            boolean jump = skiJumperContest.chooseJumpOrQuit();
            if(jump==false) {
                skiJumperContest.printRoundOrder();
                skiJumperContest.printResult();
                break;
            }
            roundCounter++;
            skiJumperContest.startRound(roundCounter);
        }
    }
}
