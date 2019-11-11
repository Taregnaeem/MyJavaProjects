import java.util.Scanner;
import java.util.ArrayList;

public class ArrayWords {
  a  public static void main(String[] args) {
        ArrayList<String> ListName = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String word = reader.nextLine();
        ListName.add(word);

        while (true) {
            if (word.isEmpty()) {
                System.out.println("The names you entered are: ");
                break;

            } else {
                System.out.println("Type your name: ");
                word = reader.nextLine();
                ListName.add(word);

            }

        }
        for (String list : ListName) {
            System.out.println(list);
        }
    }
}