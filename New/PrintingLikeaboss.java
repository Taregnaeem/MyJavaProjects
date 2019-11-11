public class PrintingLikeaboss {
    public static void PrintStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void PrintWhiteSpace(int size) {
        for (int i = 0; i <= size; i++) {
            System.out.print(" ");
        }
    }

    public static void PrintTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            PrintWhiteSpace(size - 1);
            PrintStars(i);
        }
    }

    public static void PrintXmasTree(int height) {
        int space = (height) - 1;
        int star = 1;
        for (int i = 0; i < height; i++) {
            PrintWhiteSpace(space);
            PrintStars(star);
            space--;
            star = star + 2;
        }
        for (int i = 0; i < 2; i++) {
            PrintWhiteSpace((height) - 2);
            PrintStars(3);
        }
    }

    public static void main(String[] args) {
        PrintStars(5);
        System.out.println("-----------");
        PrintTriangle(5);
        System.out.println("-----------");
        PrintXmasTree(4);
        System.out.println("-----------");
        PrintXmasTree(10);

    }
}