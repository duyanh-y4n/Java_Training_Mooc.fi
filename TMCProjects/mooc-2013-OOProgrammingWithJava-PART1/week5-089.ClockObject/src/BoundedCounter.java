public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) this.value++;
        else this.value = 0;
    }

    public String toString() {
        // write code here
        String prefix = this.value < 10 ? "0" : "";
        return prefix + value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0 && value <= this.upperLimit) this.value = value;
//        else if (value>this.upperLimit)this.value = this.upperLimit;
//        else this.value = 0;
    }
}
