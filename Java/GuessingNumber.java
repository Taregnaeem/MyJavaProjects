import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberdrawn = drawnumber();
        int i = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int rand = Integer.parseInt(reader.nextLine());
            i++;
            if (rand == numberdrawn) {
                System.out.println("Congratulation! You guessed the right number! ");
                break;
            } else if (rand > numberdrawn) {
                System.out.println("Sorry! The number you guessed is lesser!  Gusses made " + i);
            } else if (rand < numberdrawn) {
                System.out.println("Sorry! The number you guessed is greater!  Gusses made " + i);
            }
        }
    }

    private static int drawnumber();return new Random().nextInt(101);

}}