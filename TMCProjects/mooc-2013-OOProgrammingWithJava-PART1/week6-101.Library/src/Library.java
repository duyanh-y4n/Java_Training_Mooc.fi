import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list;

    public Library(){
        this.list = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        this.list.add(newBook);
    }

    public void printBooks(){
        for (Book book :
                this.list) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book book :
                this.list) {
            if (StringUtils.included(book.title(),title)) found.add(book);
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book book :
                this.list) {
            if (StringUtils.included(book.publisher(),publisher)) found.add(book);
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book book :
                this.list) {
            if (book.year()==year) found.add(book);
        }
        return found;
    }

}
