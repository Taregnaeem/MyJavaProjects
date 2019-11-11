import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = Integer.parseInt(reader.nextLine());
        int y = 0;

        System.out.println("Let's try if we can get to the method code");
        System.out.println("How many times want this line executed?");

        printText();
        greet();
        System.out.println("It's seems that we can! Let's try again");
        greet();
        greet();
        greet();
        printText();
    

    public static void greet() {
        System.out.println("Hi! This is the first method that i write in my life!");
    }

    public static void printText() {
        System.out.println("In the begining there was the swamp, the hoe and java!");
        
            printText();
        }

    }
}
