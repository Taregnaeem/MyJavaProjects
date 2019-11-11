import java.util.Scanner;

public class UserNames {
    public static void main(String[] args) {
        System.out.println("Type your name:");
        Scanner reader = new Scanner(System.in);
        String y = reader.nextLine();
        System.out.println("Type your password:");
        Scanner red = new Scanner(System.in);
        String x = red.nextLine();
        String nana = "Alex";
        String pass = "mightyducks";
        String name1 = "Emily";
        String pass1 = "cat";

        if (y.equals(nana) && x.equals(pass)) {
            System.out.println("You are now logged to the system!");
        }

        else if (y.equals(name1) && x.equals(pass1)) {
            System.out.println("You are now logged into the system!");

        } else {
            System.out.println("The username or password is invalid!");
        }
    }
}
