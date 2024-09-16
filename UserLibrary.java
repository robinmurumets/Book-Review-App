import java.util.List;
public class UserLibrary implements Library {

    public List<Book> bookList;

    public UserLibrary(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> showBooks() {
        return bookList;
    }

}
