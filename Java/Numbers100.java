public class Numbers100 {
    public static void main(String[] args) {
       int number=1;
        while (int number < 100) {
            number = 2 * number;
            number = number % 2;
            number++;
        }
    }
}