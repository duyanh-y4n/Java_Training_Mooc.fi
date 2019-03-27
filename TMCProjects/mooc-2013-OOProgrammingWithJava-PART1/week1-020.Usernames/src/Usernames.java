
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[][] User = {
                {"alex", "mightyducks"},
                {"emily", "cat"}
        };
        String username, password;
        boolean valid = false;
        System.out.println("Type your username: ");
        username = reader.nextLine();
        System.out.println("Type your password: ");
        password = reader.nextLine();
        for (int i=0; i<User.length; i++) {
            if(username.equals(User[i][0])&&password.equals(User[i][1])) {
                valid = true;
                break;
            }
        }
        System.out.println((valid?"You are now logged into the system!":"Your username or password was invalid!"));
    }
}
