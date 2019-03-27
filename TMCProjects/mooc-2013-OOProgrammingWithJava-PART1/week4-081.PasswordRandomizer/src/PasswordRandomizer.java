import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    String symbols = "abcdefghijklmnopqrstuvwxyz";
    // Define the variables

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result.concat(Character.toString(this.symbols.charAt(this.random.nextInt(this.symbols.length()))));
        }
        return result;
    }
}
