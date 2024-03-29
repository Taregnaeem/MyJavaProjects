public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }

        return false;
    }

    

    public int differenceInYears(MyDate comparedDate) {
        double diffYear = 0.00;
        if (this.year > comparedDate.year) {
            diffYear = (this.year + (double) this.month / +(double) 12 + this.day / 365)
                    - (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365);
        } else {
            diffYear = (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365)
                    - (this.year + (double) this.month / +(double) 12 + this.day / 365);
        }
        return (int) diffYear;
    }

}
