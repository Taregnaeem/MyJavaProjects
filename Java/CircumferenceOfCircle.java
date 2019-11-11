import java.util.Scanner;
import java.lang.Math.*;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        double radius, formula;
        Scanner sor = new Scanner(System.in);
        System.out.println("Type your radius:");
        radius = sor.nextInt();
        formula = 2 * radius * Math.PI;
        System.out.println("The circumference of the circle is:" + formula);
    }
}