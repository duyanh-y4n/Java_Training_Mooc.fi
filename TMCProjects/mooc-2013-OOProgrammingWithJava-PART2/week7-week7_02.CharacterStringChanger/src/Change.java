public class Change {
    private char toBeChangedChar;
    private char changeChar;

    public Change(char a, char b) {
        this.toBeChangedChar = a;
        this.changeChar = b;
    }

    public String change(String word) {
        String result = "";
        for (char c :
                word.toCharArray()) {
            if (c == toBeChangedChar) result += changeChar;
            else result+=c;
        }
        return result;
    }

    public char getToBeChangedChar() {
        return this.toBeChangedChar;
    }
}
