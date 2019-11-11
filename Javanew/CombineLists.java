import java.util.ArrayList;.
import java.util.Scanner;

public class CombineLists {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        // for (int x : first) {
        // first.add(x);
        // }
        // for (int y : second) {
        // second.add(y);
        // }
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Type your number:");
            String word= reader.nextLine();

            if (word.isEmpty() ) {  
                break;
            }
                
      else {  System.out.println("Type your number:");
             int number=reader.nextInt();
            if  (list1.contains(number)){
                System.out.println("The number is already in the list!");
            }
            else {
                list1.add(number);
            }

        combine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 7]

        System.out.println(list2); // prints [5, 10, 7]
    }
}
System.out.println("Type the number for the second list:");
int num=reader.nextInt();
while (true){

}
}