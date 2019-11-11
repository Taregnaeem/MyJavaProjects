import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + converse(text));
    }

    public static String converse(String text) {
        int i = text.length() - 1;
        String helper = "";
        while (i >= 0) {
            char nam = text.charAt(i);
            helper = helper + nam;
            i--;
        }
        return helper;
    }
}