import java.util.Scanner;

public class FirstNumberSecondNumberLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner red = new Scanner(System.in);
        System.out.println("Enter the first limit:");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second limit:");
        int y = Integer.parseInt(red.nextLine());
        System.out.println("");
        while (x <= y) {
            System.out.println(x);
            x++;
        }
        if (x > y) {
            System.out.println("");
        }

    }
}