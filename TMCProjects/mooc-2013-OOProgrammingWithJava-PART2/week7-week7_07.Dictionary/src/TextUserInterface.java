import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start(){
        String input;
        this.printMenu();
        while (true){
            input = this.reader.nextLine();
            if (this.cleanString(input).equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (this.cleanString((input)).equals("add")){
                this.add();
            } else if (this.cleanString(input).equals("translate")){
                this.translate();
            }
            this.printMenu();
        }
    }

    private void translate() {
        String word;
        System.out.print("Give a word: ");
        word = this.reader.nextLine();
        System.out.print("Translation: ");
        System.out.println(this.dictionary.translate(word));
    }

    private void add() {
        String word, translation;
        System.out.print("In Finnish: ");
        word = this.reader.nextLine();
        System.out.print("Translation: ");
        translation = this.reader.nextLine();
        this.dictionary.add(word,translation);
    }

    private String cleanString(String input) {
        return input.toLowerCase().trim();
    }

    public void printMenu(){
        System.out.println("Statements:\n" +
                "  add - adds a word pair to the dictionary\n" +
                "  translate - asks a word and prints its translation\n" +
                "  quit - quits the text user interface");
    }
}
