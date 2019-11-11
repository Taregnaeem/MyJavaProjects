import java.util.ArrayList;

public class PrintList {
    public static void main(String[] args) {
        ArrayList<String> ProgrmmingLanguages = new ArrayList<String>();
        ProgrmmingLanguages.add("java");
        ProgrmmingLanguages.add("C++");
        ProgrmmingLanguages.add("Python");
        ProgrmmingLanguages.add("Ruby");
        ProgrmmingLanguages.add("Cobol");
        ArrayList<String> Countries = new ArrayList<String>();
        Countries.add("Norway");
        Countries.add("Bolivia");
        Countries.add("USA");
        Countries.add("Sudan");
        print(Countries);
        print(ProgrmmingLanguages);

    }

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);
        }
    }
}
