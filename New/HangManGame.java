import java.util.Scanner;
public class HangManGame {
     public static void main(String[] args) {
    Scanner reader =new Scanner(System.in);
    Hangman hangman =new hangman();
    System.out.println("************");
    System.out.println("* Hangman *");
    System.out.println("************");
    System.out.println("");
    printmenu();
    System.out.println("");
       
    }
    public static void printmenu(){
        System.out.println(" * menu * ");
        System.out.println(" Quit -Quits the game ");
        System.out.println(" Status -Prints the game status ");
        System.out.println(" A single letter uses the letter as a guess ");
        System.out.println(" An empty line prints this menu ");



    }
    While(hangman.gameon()){
        System.out.println(" Type a command: ");
        String command = reader.nextLine;
        

    }
}