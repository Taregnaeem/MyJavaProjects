import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String ko = "Elephant";
        String ok = "Tiger";
        String together = ok + ko;
        System.out.println("The lenght of the word Elephant is " + ko.length());
        System.out.println("The lenght of the word Tiger is " + ok.length());
        System.out.println("The lenght of the words Elephant and Tiger is " + together.length());
        System.out.println("Type your name: ");
        String x = reader.nextLine();
        int y = CalculatingCharacters(x);
        System.out.println("The number of characters is: " + y);
        System.out.println("Type your name: ");
        String mam = reader.nextLine();
        char ls = firstcharacter(mam);
        System.out.println("The first charcter of the word is:" + ls);
        System.out.println("Type your name: ");
        String z = reader.nextLine();
        char po = LastCharacter(z);
        System.out.println("The last charcter of the name is:" + po);
    }

    public static int CalculatingCharacters(String text) {
        int number = text.length();
        return number;
    }

    public static char firstcharacter(String text) {
        char name = text.charAt(0);
        return name;
    }

    public static char LastCharacter(String text) {
        char last = text.charAt(text.length() - 1);
        return last;
    }
}