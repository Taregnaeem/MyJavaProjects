public class leapyear {
    public static void main(String[] args) {
        // Year to check
        int year = 2004;
        // Year if divisible by 4 then its a leap year
        if ((year % 400 == 0) || (year % 4 == 0) || (year % 100 != 0))
            System.out.print("Year " + year + " is a leap year ");
        else
            System.out.print("Year " + year + " is not a leap year ");
    }

}