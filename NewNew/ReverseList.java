import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> MyList = new ArrayList<String>();
        System.out.println("Type your name please:");
        String name = reader.nextLine();
        MyList.add(name);
        while (true) {
            if (name.isEmpty()) {
                System.out.println("The Names you entered in reversed order are: ");
                break;
            } else {
                System.out.println("Type your name please:");
                name = reader.nextLine();
                MyList.add(name);
            }
        }
        Collections.sort(MyList);
        for (String last : MyList) {
            System.out.println(last);

        }
    }
}