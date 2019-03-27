
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }


    private static void printWithSmileys(String characterString) {
        printlnWithSmileys(characterString);
        System.out.println(":) " + characterString + (characterString.length()%2==1?"  :)":" :)"));
        printlnWithSmileys(characterString);
    }

    private static void printlnWithSmileys(String characterString) {
        for (int i = 0; i < characterString.length()/2+3; i++) {
            System.out.print(":)");
        }
        if (characterString.length() % 2 == 1) System.out.print(":)");
        System.out.println();
    }
}
