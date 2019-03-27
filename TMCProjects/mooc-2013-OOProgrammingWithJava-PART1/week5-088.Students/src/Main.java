
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String searchTerm;
        while (true) {
            String tempName, tempStudentNumber;
            System.out.println("name: ");
            tempName = reader.nextLine();
            if (tempName.isEmpty()) break;
            System.out.println("studentnumber: ");
            tempStudentNumber = reader.nextLine();
            list.add(new Student(tempName, tempStudentNumber));
        }
        for (Student student :
                list) {
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        System.out.println("Result:");
        searchTerm = reader.nextLine();
        for (Student student :
                list) {
            if (student.getName().contains(searchTerm)) System.out.println(student);
        }
    }
}