
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

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        if (added.euros >= 0 && added.cents >= 0) return new Money(this.euros + added.euros, this.cents + added.cents);
        else return new Money(this.euros, this.cents);
    }

    public Money minus(Money added) {
        if (this.less(added)) return new Money(0, 0);
        if (added.euros >= 0 && added.cents >= 0) {
            int tmpEuros = this.euros - added.euros;
            int tmpCents = this.cents - added.cents;
            if (tmpCents < 0) {
                tmpCents = 100 + tmpCents;
                tmpEuros--;
            }
            return new Money(tmpEuros, tmpCents);
        } else return new Money(this.euros, this.cents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) return true;
        else if (this.euros == compared.euros && this.cents < compared.cents) return true;
        return false;
    }
}
