import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> ListNames = new ArrayList<String>();

        while (true) {
            System.out.println("Type your name: ");
            String name = reader.nextLine();
            if (ListNames.contains(name)) {
                System.out.println("The name you entered is allready in the list!");
            } else {
                ListNames.add(name);
            }

        }

    }

}