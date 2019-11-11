import java.util.ArrayList;

public class AllPositive {
    public static boolean Alpositive(ArrayList<Integer> Numers) {

        for (int number : Numers) {
            if (number < 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Lists = new ArrayList<Integer>();
        Lists.add(12);
        Lists.add(9);
        Lists.add(0);
        Lists.add(-9);
        Lists.add(90);
        Lists.add(98);
        if (Alpositive(Lists)) {
            System.out.println("The List contains negative numbers!");
        } else {
            System.out.println("The List does not contain negative numbers!");
        }

    }
}