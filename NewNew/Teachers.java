import java.util.ArrayList;
import java.util.Collections;

public class Teachers {
    public static void main(String[] args) {
        ArrayList<String> myteachers = new ArrayList<String>();
        myteachers.add("Ahmed");
        myteachers.add("Mohammed");
        myteachers.add("Susan");
        myteachers.add("Dali");
        myteachers.add("kawai");
        myteachers.add("Sarah");
        System.out.println("The number of teachers is " + myteachers.size());
        System.out.println("The first teacherin the list is " + myteachers.get(0));
        System.out.println("The last teacher in the list is " + myteachers.get(4));
        // myteachers.remove("Sarah");
        int place = 0;
        System.out.println(myteachers.get(place));
        place++;
        System.out.println(myteachers.get(place));
        place++;
        System.out.println(myteachers.get(place));
        place++;
        System.out.println(myteachers.get(place));
        place++;
        System.out.println(myteachers.get(place));
        place++;
        System.out.println(myteachers.get(place));
        place++;

        if (myteachers.contains("kawai")) {
            System.out.println("The list contains the name Sarah");
        } else {
            System.out.println("The list does not contain the name Sarah");
        }
        Collections.sort(myteachers);
        for (String name : myteachers) {
            System.out.println("The list in alpahabetical order is:");
            System.out.println(name);
        }
    }
}