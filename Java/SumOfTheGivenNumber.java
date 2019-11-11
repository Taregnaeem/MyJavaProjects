import java.util.Scanner;

public class SumOfTheGivenNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int x = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int y = 0;
        while (y <= x) {
            sum = sum + y;
            y++;
        }
        System.out.println(sum);
    }

}
