import java.util.Scanner;

public class Calculator {
    private Reader reader;
    private int calNumb;

    public Calculator() {
        this.reader = new Reader();
        this.calNumb = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void statistics() {
        System.out.println("Calculations done " + this.calNumb);
    }

    private void product() {
        int value1, value2;
        System.out.print("value1: ");
        value1 = this.reader.readInteger();
        System.out.print("value2: ");
        value2 = this.reader.readInteger();
        System.out.println("product of the values " + (value1 * value2));
        this.calNumb++;
    }

    private void difference() {
        int value1, value2;
        System.out.print("value1: ");
        value1 = this.reader.readInteger();
        System.out.print("value2: ");
        value2 = this.reader.readInteger();
        System.out.println("difference of the values " + (value1 - value2));
        this.calNumb++;
    }

    private void sum() {
        int value1, value2;
        System.out.print("value1: ");
        value1 = this.reader.readInteger();
        System.out.print("value2: ");
        value2 = this.reader.readInteger();
        System.out.println("sum of the values " + (value1 + value2));
        this.calNumb++;
    }

}
