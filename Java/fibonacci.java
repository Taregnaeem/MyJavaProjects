public class fibonacci {
    public static void main(String[] args) {
        // Number of limit to generate in a series
        int limit = 20;
        long[] series = new long[limit];
        // Create first tow series elements
        series[0] = 0;
        series[1] = 1;
        // Create the Fibonacci series and store it in an array
        for (int i = 2; i < limit; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        // print the fibonacci series numbers
        System.out.println(" fibonacci series upto " + limit);
        for (int i = 0; i < limit; i++) {
            System.out.println(series[i] + " ");
        }

    }
}