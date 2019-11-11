import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your password please:");
            String password = reader.nextLine();
            if (password.equals("carrot")) {
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
        System.out.println("right");
        System.out.println("The Secret: You cracked the code buddy!");
    }
}