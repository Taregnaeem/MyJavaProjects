import java.util.Scanner;

public class Palindrome {
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

    public static boolean palindrome(String text) {
        String word = converse(text);
        if (word.equals(text)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

}
