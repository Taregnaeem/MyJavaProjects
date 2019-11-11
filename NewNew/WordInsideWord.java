import java.util.Scanner;

public class WordInsideWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type your first word:");
        String noe = reader.nextLine();
        System.out.println("Type your second word:");
        String por = reader.nextLine();
        int index = noe.indexOf(por);
        if (index > -1) {
            System.out.println("The word " + por + " is found in the word " + noe);
        } else {
            System.out.println("The word " + por + " is not found in the word " + noe);
        }
    }

}