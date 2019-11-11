import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int x = reader.nextInt();
        if (x > 0 && x < 120) {
            System.out.println("Ok");
        } else if (x < 0 || x > 120) {
            System.out.println("That's immposible!");
        }
    }
}