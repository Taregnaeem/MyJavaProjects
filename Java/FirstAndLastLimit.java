import java.util.Scanner;

public class FirstAndLastLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner red = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the last  number:");
        int y = Integer.parseInt(red.nextLine());

        while (x <= y) {
            System.out.println(x);
            x++;
        }
        if (x > y) {
            System.out.println("");
        }
    }

}