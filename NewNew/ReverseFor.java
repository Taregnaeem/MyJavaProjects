import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + converse(text));
    }

    public static String converse(String text) {
        String helper = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char nam = text.charAt(i);
            helper = helper + nam;
        }
        return helper;
    }
}