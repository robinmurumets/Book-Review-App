import java.util.ArrayList;
import java.util.List;
public class UserLibrary implements Library {

    public List<Book> bookList;

    public UserLibrary() {
        this.bookList = new ArrayList<>();
    }


    @Override
    public void showBooks() {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    @Override
    public void addBook(Book book) {
        boolean found = false;
        for (Book book1 : bookList) {
            if (book.equals(book1)) {
                found = true;
            }
        }
        if (found == true) {
            System.out.println("The book is already in the library");
        } else {
            bookList.add(book);
            System.out.println("*Book added*");
            found = false;
        }

    }

    @Override
    public void removeBook(Book book) {

        boolean found = false;
        for (Book book1 : bookList) {
            if (book.equals(book1)) {
                found = true;
            }
        }
        if (found == true) {
            bookList.remove(book);
            System.out.println("*Book removed*");
            found = false;
        } else {
            System.out.println("This book isn't in the library");

        }

    }
}
