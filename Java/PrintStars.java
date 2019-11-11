public class PrintStars {
    public static void Printstar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                printWhiteSpace(i);

            }

            System.out.println("*");
            printWhiteSpace(i);
        }
        System.out.println("---------------");
    }

    public static void printWhiteSpace(int size) {

        System.out.print("-");

    }

    public static void main(String[] args) {
        Printstar(4);

    }
}