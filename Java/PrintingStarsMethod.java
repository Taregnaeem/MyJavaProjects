public class PrintingStarsMethod {

    private static void PrintStars(int amount, String go) {
        System.out.print(" *");
        String go = "-";

        int i = 0;
        while (i < amount) {
            System.out.print(" *");
            i++;
        }
        String go = "-";

    }

    public static void PrintMany(int amount) {
        int y = 0;
        while (y < amount) {
            PrintStars(amount);
            System.out.println("");
            y++;

        }
    }

    public static void PrintTriangle(int width, int height) {
        int amount = 0;
        int x = 0;
        int z = 0;
        for (x = 0; x < height; x++) {
            for (z = 1; z < width; z++) {
                PrintStars(amount);

            }
            PrintStars(amount);
            System.out.println("");

        }
    }

    public static void Printrevert(int size) {
        int amount = 0;
        int m = 0;
        int n = 0;
        for (m = 0; m < size; m++) {
            for (n = 0; n < m; n++) {
                PrintStars(amount);
            }
            PrintStars(amount);
            System.out.println("");
        }
    }

    public static void PrintWhiteSpace(int size) {
        int amount = 0;
        String go;
        int m = 0;
        int n = 0;
        for (m = 0; m < size; m++) {
            for (n = 0; n < m; n++) {
                PrintStars(go);
            }
            PrintStars(go);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        PrintStars(5);
        System.out.println("");
        PrintStars(3);
        System.out.println("");
        PrintStars(9);
        System.out.println("");
        PrintMany(4);
        System.out.println("");
        PrintTriangle(17, 3);
        System.out.println("");
        Printrevert(4);
        System.out.println("");
        PrintWhiteSpace(4);

    }

}
