import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    private static final int MAX_GRADE = 5;
    private ArrayList<Integer> list;
    private int[] gradeDistribution;

    public Grades() {
        this.list = new ArrayList<Integer>();
        gradeDistribution = new int[MAX_GRADE + 1];
    }

    public void readGradeList(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int temp = Integer.parseInt(scanner.nextLine());
            if (temp == -1) break;
            else if (temp <= 60 && temp>=0) this.list.add(temp);
        }
        makeGradeDistribution();
    }

    public void print() {
        for (int grade :
                list) {
            System.out.println(grade);
        }
    }

    private void makeGradeDistribution() {
        for (int points :
                this.list) {
            if (points < 30) {
                this.gradeDistribution[0]++;
            } else if (points < 35) {
                this.gradeDistribution[1]++;
            } else if (points < 40) {
                this.gradeDistribution[2]++;
            } else if (points < 45) {
                this.gradeDistribution[3]++;
            } else if (points < 50) {
                this.gradeDistribution[4]++;
            } else {
                this.gradeDistribution[5]++;
            }
        }
    }

    public int[] getGradeDistribution() {
        return this.gradeDistribution;
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            this.printGrade(i);
        }
    }

    public void printGrade(int grade) {
        System.out.print(grade + ": ");
        for (int i = 0; i < this.gradeDistribution[grade]; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printAcceptance(){
        int sum = 0;
        for (int i = 0; i < MAX_GRADE+1; i++) {
            sum+=this.gradeDistribution[i];
        }
        System.out.printf("Acceptance percentage: %.1f \n", 1.0*100*(sum-this.gradeDistribution[0])/sum);
    }
}
