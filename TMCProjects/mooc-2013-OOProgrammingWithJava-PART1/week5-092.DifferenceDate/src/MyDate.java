public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int differenceInDates(MyDate otherDate){
        int thisTotalDays = this.day + this.month*30 + this.year*365;
        int otherTotalDays = otherDate.day + otherDate.month*30 + otherDate.year*365;
        int diff = (thisTotalDays-otherTotalDays);
        return diff>0?diff:-diff;
    }

    public int differenceInYears(MyDate otherDate){
        return this.differenceInDates(otherDate)/365;
    }

}
