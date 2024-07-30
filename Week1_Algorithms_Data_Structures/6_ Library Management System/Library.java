import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    // Inner class representing a Book
    static class Book {
        private int bookId;
        private String title;
        private String author;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        public int getBookId() {
            return bookId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book:\n" +
                    "bookId=" + bookId +
                    ", \ntitle='" + title + '\'' +
                    ", \nauthor='" + author + '\'' 
                    ;
        }
    }

    // Linear search algorithm
    public static Book linearSearch(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary search algorithm (requires sorted list)
    public static Book binarySearch(List<Book> books, String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);

            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Book not found
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "Moby Dick", "Herman Melville"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Sort books by title for binary search
        books.sort(Comparator.comparing(Book::getTitle));

        // Test Linear Search
        Book result1 = linearSearch(books, "Moby Dick");
        System.out.println("Linear Search Result:\n " + result1);

        // Test Binary Search
        Book result2 = binarySearch(books, "Moby Dick");
        System.out.println("\nBinary Search Result:\n " + result2+"\n");
    }
}
