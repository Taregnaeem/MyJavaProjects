public class Whitespace {
    public static void PrintStars(int size) {

        int i = 0;
        int j = 0;

        for (i = 0; i < size; i++) {

            for (j = 0; j < size; n++) {

                System.out.print("*");
                PrintWhiteSpaces(size);
            }

        }
        System.out.println("*");
        PrintWhiteSpaces(size);

    }

    }

    public static void PrintWhiteSpaces(int size) {
        // for (int z = 0; z < size; z++) {
        // for (int x = size; x < z; x++) {
        System.out.print(" ");
        // }
        // System.out.print(" ");
        // }

    }

    public static void PrintTriangle(int size) {
        PrintStars(size);
        PrintWhiteSpaces(size);
    }

    public static void main(String[] args) {
        PrintTriangle(4);
    }
}