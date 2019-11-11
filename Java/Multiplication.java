import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter the numbers you want to multiply:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
        System.out.println("The sum of the tow integers is " + z);
    }
}