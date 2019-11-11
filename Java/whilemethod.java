import java.util.Scanner;

public class whilemethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name1 = "Tamara ";
        String name2 = " James";
        int age = 24;
        String pop = "Holi";
        printText(pop + age);
        printText(name1 + name2);
        printText("Tareg");
        printText("Soli");
        System.out.println("How many timed you want this statement to execute?");
        int x = Integer.parseInt(reader.nextLine());
        int y = 0;

        while (y <= x) {
            printText("Soli");
            y++;
        }
    }

    public static void printText(String name) {
        System.out.println("Hi " + name + " Greetings from the methods world! ");
    }
}