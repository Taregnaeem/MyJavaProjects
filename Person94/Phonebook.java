import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number) {
        Person Phonebooks = new Person(name, number);
        this.list.add(Phonebooks);
    }

    public void printAll() {

        for (Person Phonebooks : this.list) {
            System.out.println(Phonebooks);

        }
    }

    public String searchNumber(String name) {
        for (Person persons : list) {
            if (persons.getName().equals(name)) {
                return persons.getNumber();
            }
        }
        return "number not known";
    }

}