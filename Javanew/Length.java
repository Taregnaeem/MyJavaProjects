import java.util.ArrayList;

public class Length {
    public static ArrayList<Integer> Lengths(ArrayList<String> listy) {
        ArrayList<Integer> nana = new ArrayList<Integer>();
        for (String word : listy) {
            nana.add(word.length());
        }
        return nana;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = Lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}