import java.util.Scanner;

public class SeparatingCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String ne = reader.nextLine();

        if (ne.length() < 3) {
            System.out.println("The name you entered is less than 3 letters!");
        }

        else if (ne.length() >= 3) {
            char x = ne.charAt(0);
            System.out.println("First Character is " + x);
            char b = ne.charAt(1);
            System.out.println("Second Character is " + b);
            char s = ne.charAt(2);
            System.out.println("Third Character is " + s);

        }

    }

}