import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();

        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;

    }

    public void drawNumbers() {

        // Write the number drawing here using the method containsNumber()
        for (int i = 0; i < 7; i++) {
            int x = random.nextInt(40);
            this.numbers.add(x);

        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        for (int x : numbers) {
            if (numbers.contains(x)) {
                return false;
            }
        }

        // if the execution reached this far, no negative numbers were found
        // so we return true
        return true;
    }

}
