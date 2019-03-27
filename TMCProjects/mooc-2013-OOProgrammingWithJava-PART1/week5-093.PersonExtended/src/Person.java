import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthday = getCurrentDate();
    }


    public int age() {
// calculate the age based on the birthday and the current day
        return this.birthday.differenceInYears(this.getCurrentDate());
    }

    public MyDate getCurrentDate(){
        MyDate currentDate = new MyDate(
                Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR)
        );
        return currentDate;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return compared.birthday.isLater(this.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
