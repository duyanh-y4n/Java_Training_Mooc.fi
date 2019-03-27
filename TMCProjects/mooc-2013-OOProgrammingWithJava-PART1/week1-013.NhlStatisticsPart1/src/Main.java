
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top 10 based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();
        System.out.println("Top 25 based on Penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();
        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();
        System.out.println("Statistics of Philadenphia Team");
        NHLStatistics.teamStatistics("PHI");
        System.out.println();
        System.out.println("Anaheim Team players sorted by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
