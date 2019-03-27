
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInDates(MyDate otherDate) {
        int thisTotalDays = this.day + this.month * 30 + this.year * 365;
        int otherTotalDays = otherDate.day + otherDate.month * 30 + otherDate.year * 365;
        int diff = (thisTotalDays - otherTotalDays);
        return diff > 0 ? diff : -diff;
    }

    public int differenceInYears(MyDate otherDate) {
        return this.differenceInDates(otherDate) / 365;
    }

    public boolean isLater(MyDate otherDate) {
        if (this.year > otherDate.year) return true;
        else if (this.year == otherDate.year && this.month > otherDate.month) return true;
        else if (this.year == otherDate.year && this.month == otherDate.month && this.day > otherDate.day) return true;
        else return false;
    }
}
