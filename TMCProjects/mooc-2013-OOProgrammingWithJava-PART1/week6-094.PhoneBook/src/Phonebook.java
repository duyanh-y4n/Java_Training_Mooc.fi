import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list;
    public Phonebook(){
        this.list = new ArrayList<Person>();
    }
    public void add(String name, String number){
        this.list.add(new Person(name, number));
    }
    public void printAll(){
        for (Person person :
                this.list) {
            System.out.println(person);
        }
    }
    public String searchNumber(String name){
        for (Person person :
                this.list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
