import java.util.ArrayList;

public class Greatest {
    public static int greatest(ArrayList<Integer> list) {

        int greatest = list.get(0);
        for (int great : list) {
            if (greatest < great) {
                greatest = great;

            }
        }
        return greatest;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
