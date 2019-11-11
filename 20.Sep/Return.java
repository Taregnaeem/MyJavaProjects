public class Return {
    public static void main(String[] args) {
        int number = ReturnAlwaysTen();
        System.out.println("The number that will be printed is:" + number);
        int y = 4 * ReturnAlwaysTen() + (ReturnAlwaysTen() / 2) - 8;
        System.out.println("The number that will be printed is:" + y);
    }

    public static int ReturnAlwaysTen() {
        return (10);
    }
}
