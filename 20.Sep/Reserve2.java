import java.util.Scanner;

public class Reserve2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String word = reader.nextLine();
        for (int i = word.length() - 1; i > -1; i--) {
            char letter = word.charAt(i);
            System.out.print(letter);
        }
        System.out.println("");
    }
}