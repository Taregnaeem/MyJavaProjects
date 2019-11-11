import java.util.Scanner;

public class Myleapyear {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the value of the year you want to check:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if ((x % 400 == 0) || (x % 4 == 0) || (x % 100 != 0))
            System.out.println("The year is a leap year");
        else
            System.out.println("The year you entered is not a leap year");

    }
}