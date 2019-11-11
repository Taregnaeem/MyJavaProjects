import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]");
        int x = reader.nextInt();
        if (x < 30) {
            System.out.println("Failed");
        } else if (x <= 35) {
            System.out.println("D");
        } else if (x <= 39) {
            System.out.println("C");
        } else if (x <= 45) {
            System.out.println("B");
        } else if (x <= 50) {
            System.out.println("A");
        } else if (x <= 60) {
            System.out.println("A+");
        } else
            System.out.println("Please enter a valid number");

    }
}