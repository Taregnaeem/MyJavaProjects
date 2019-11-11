import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner Reader = new Scanner(System.in);
        String mori = Reader.nextLine();
        System.out.println("Hi " + mori);
    }
}
