public class SumOfnumbers {
    public static void main(String[] args) {
        int answer = sum(5, 10, 60, 88);
        System.out.println("The sum of the numbers is " + answer);

        int result = least(15, 7);
        System.out.println("The least number is:" + result);
        int result1 = greatest(5, 10, 50);
        System.out.println("The greatest number is:" + result1);
        int avg = average(10, 10, 10, 10);
        System.out.println("The average of the numbers is " + avg);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static int average(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        int average = sum / 4;
        return average;
    }

    public static int least(int n, int z) {
        if (n < z) {
            return n;
        } else {
            return z;
        }
    }

    public static int greatest(int x, int y, int c) {
        int b = great(x, y);
        if (c > b) {
            return c;
        } else {
            return b;
        }

    }

    public static int great(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }
}
