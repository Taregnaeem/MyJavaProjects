public class Compare {
    public static void main(String[] args) {
        // declare tow numbers
        int num1 = 724;
        int num2 = 724;
        if (num1 > num2) {
            System.out.print(num1 + "is grater than" + num2);
        } else if (num2 > num1) {
            System.out.print(num2 + "is greater than" + num1);
        } else {
            System.out.print(num1 + "is equal to" + num2);
        }
    }
}