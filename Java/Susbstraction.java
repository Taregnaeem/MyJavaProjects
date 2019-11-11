import java.util.Scanner;

public class Susbstraction {

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter the values of the tow integer values");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x - y;
        System.out.println("Sum of the entered integers is " + z);
    }
}