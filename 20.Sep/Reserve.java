import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String word = reader.nextLine();
        int i = 1;
        while (word.length() >= i) {
            System.out.println(i + "Cahracter is " + word.charAt(word.length() - i));
            i++;
        }
        System.out.println("The reserve word is " + );
    }
}