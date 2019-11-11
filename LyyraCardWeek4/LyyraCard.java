public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return " The Card has " + this.balance + " euros";
    }

    public void payEconomical() {

        if (this.balance <= 2.5) {
            this.balance = balance;
        } else {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {

        if (this.balance <= 4) {
            this.balance = balance;
        } else {
            this.balance = this.balance - 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (amount <= 150) {
            this.balance = amount + this.balance;
        }
        if (amount >= 150 || amount < 0) {
            this.balance = balance;
        }

    }

}