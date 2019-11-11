
public class Counter {
    private int value;

    public Counter(int startingValue, boolean check) {
        startingValue = 0;
        check = true;

    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {

        return this.value;
    }

    public void increase() {
        this.value += value;
    }

    public void decrease() {
        this.value -= value;
    }

    public void increase(int increaseAmount) {
        if (value > 0) {
            this.increase(increaseAmount);
        }
    }

    public void decrease(int decreaseAmount) {
        while (this.value > decreaseAmount) {
            this.decrease(decreaseAmount);
        }
    }

}