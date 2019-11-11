import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first number:");
            double number = Double.parseDouble(reader.nextLine());
            System.out.println("Enter the second number:");
            double num = Double.parseDouble(reader.nextLine());
            double sum = Graph.addNumber(number);

            if ((number > -30) || (number < 40) || (num > -30) || (num < 40)) {
                break;
            } else {
                System.out.println("The tempreature you entered is not valid!");
            }
        }
        System.out.println(sum);
    }
}