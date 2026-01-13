import java.util.ArrayList;
class Book {
    int bookId;
    String bookName;
    String authorName;
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Python Basics", "Guido van Rossum"));
        books.add(new Book(103, "C Programming", "Dennis Ritchie"));
        for (Book b : books) {
            System.out.println("Book ID: " + b.bookId);
            System.out.println("Book Name: " + b.bookName);
            System.out.println("Author Name: " + b.authorName);
            System.out.println("-----------------------");
        }
    }
}

