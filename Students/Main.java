import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String StudentName;
        String StudentNumber;
        String searchTerm;
        ArrayList<Student> list = new ArrayList<Student>();
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type your name: ");
            StudentName = reader.nextLine();
            if (StudentName.isEmpty()) { // could also be: word.equals("")
                // word was empty, meaning that the user only pressed enter
                break;
            }

            System.out.println("Type your number");
            StudentNumber = reader.nextLine();
            list.add(new Student(StudentName, StudentNumber));
        }
        for (Student students : list) {
            System.out.println(students);
        }
        System.out.println("");
        System.out.println("Give search term: ");
        searchTerm = reader.nextLine();
        System.out.println("");
        System.out.println("Result: ");

        int i = 0;
        for (i = 0; i < list.size(); i++) {
            Student nameToSearch = list.get(i);
            String strNameToSearch = nameToSearch.getName();
            if (strNameToSearch.contains(searchTerm)) {
                System.out.println(nameToSearch);
            }
            i++;
        }

    }

}
