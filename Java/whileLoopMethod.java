public class whileLoopMethod {
    public static void greet(String name) {
        System.out.println("Hi, " + name + " Greetings from world of methods");
    }

    public static void greetingsmany(String name, int amount) {
        int i = 0;
        while (i < amount) {
            greet(name);
            i++;
        }

    }

    public static void main(String[] args) {
        greetingsmany("Mark", 3);
        System.out.println("and");
        greetingsmany("Mani", 3);
    }
}