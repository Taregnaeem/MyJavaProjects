public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int x = this.euros + added.euros;
        int y = this.cents + added.cents;
        return new Money(x, y);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros && this.cents < compared.cents) {
            return false;
        }
        return true;
    }

    public Money minus(Money decremented) {
        int Euros = 0;
        int Cents = 0;
        if (this.less(decremented)) {
            return new Money(Euros, Cents);

        }
        if (this.cents < decremented.cents) {
            Euros--;
            Cents = 100 - decremented.cents;
            return new Money(Euros, Cents);
        } else {
            Euros = this.euros - decremented.euros;
            Cents = this.euros - decremented.cents;

        }
        return new Money(Euros, Cents);
    }
}