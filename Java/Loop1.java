import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner mam=new Scanner(System.in);
        While (true){
            System.out.println("I can program!");
            
            System.out.println("Contiue?  type no to quit");
            String command=mam.nextLine();
            if(command.equals("no")){
                break;
            }
        }
            System.out.println("Thank you and see you later!");
        
    }
}