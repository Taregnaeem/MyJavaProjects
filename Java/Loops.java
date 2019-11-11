import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your numbers:");
        int numbers;
        double sum = 0;
        int count = 0;
        double average = 1;
        int oddnumber = 0;
        int evennumber = 0;
        while (true) {
            numbers = Integer.parseInt(reader.nextLine());
            if (numbers % 2 == 0) {
                evennumber++;
            } else if (numbers % 2 != 0 && numbers != -1) {
                oddnumber++;
            }
            if (numbers == -1) {
                System.out.println("Thank you, see you later!");
                break;
            } else {
                sum = sum + numbers;
                count++;
                average = sum / count;
            }

        }
        System.out.println("The sum is " + (sum));
        System.out.println("The count is " + count);
        System.out.println("The average is " + average);
        System.out.println("Even numbers  count is " + evennumber);
        System.out.println("Odd numbers count is  " + oddnumber);

    }
}
