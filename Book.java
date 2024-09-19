import java.util.List;
public class Book {
    public String Title;
    public String Author;
    public int Page_Number;
    public int Year;
    private List<Review> Reviews;

    public Book(String title, String author, int page_Number, int year, List<Review> reviews) {
        Title = title;
        Author = author;
        Page_Number = page_Number;
        Year = year;
        Reviews = reviews;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPage_Number() {
        return Page_Number;
    }

    public void setPage_Number(int page_Number) {
        Page_Number = page_Number;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public List<Review> getReviews() {
        return Reviews;
    }

    public void setReviews(List<Review> reviews) {
        Reviews = reviews;
    }

    public void addReview(Review review) {
        Reviews.add(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Page_Number=" + Page_Number +
                ", Year=" + Year +
                ", Reviews=" + Reviews +
                '}';
    }
}
