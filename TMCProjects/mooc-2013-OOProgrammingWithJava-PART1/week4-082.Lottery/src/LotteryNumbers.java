import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int length;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.length = 7;
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while (this.numbers.size()<this.length) {
            int temp = random.nextInt(39)+1;
            if (this.numbers.contains(temp)==false)this.numbers.add(temp);
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
