import java.util.Scanner;

public class NameAndAgegreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Your name is:");
        String name = reader.nextLine();
        System.out.println("Your age is:");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("Your name is " + name + " and your age is " + age + " nice to meet you!");
    }
}