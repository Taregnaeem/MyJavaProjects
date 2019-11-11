import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner res = new Scanner(System.in);
        System.out.println("Type your word:");
        String neo = reader.nextLine();
        System.out.println("Type the length of the word:");
        int i = res.nextInt();
        int k = neo.length();
        String word = neo.substring(k - i);

        System.out.println("Result:" + word);
    }

}