import java.util.Scanner;
public class UserNames {
     public static void main(String[] args) {
         System.out.println("Enter your name:")
     Scanner reader = new Scanner(System.in);
    Scannenr red=new Scanner(System.in);
     String name="Alex";
     String pass="mightyducks";
     String name1="Emily";
     String pass1="cat";
     String name=reader.nextLine();
     String name1=red.nextLine();
     String pass=reader.nextLine();
     String pass1=reader.nextLine();
     if(reader.equal(name)||red.equals(name1)){
         System.out.println("Enter your password:");
     }
     else {
         System.out.println("The Username is not valid!");
     }
     if(reader.equals(pass)||red.equals(pass1)){
         System.out.println("You are now logged into the system!");

     }
     else{
         System.out.println("The password you entered is incorrect!");
     }
    }
}