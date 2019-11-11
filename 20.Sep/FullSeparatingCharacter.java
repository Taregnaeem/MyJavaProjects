import java.util.Scanner;

public class FullSeparatingCharacter {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter your name:");
        String Sede = no.nextLine();
        int i = 0;
        while (true) {
            if (i > (Sede.length() - 1)) {
                break;
            } else {
                char x = Sede.charAt(i);
                System.out.println(i + 1 + ". Character is:" + x);
                i++;
            }
        }
        System.out.println(" ");
    }
}