/**
 * Book
 */
public class Book {

    String isbn, author, title;
    static int totalCount = 0;

    // Instance initializer block
    {
        totalCount += 1; // Increment totalCount every time a new Book is created
    }

    // Method to borrow a book
    void borrowBook() {
        System.out.println("Borrow successful");
    }

    // Method to return a book
    void returnBook() {
        System.out.println("Return successful");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating a new Book object
        Book harryPotter = new Book();
        
        // Printing the total count of Book objects created
        System.out.println(Book.totalCount); // Should print 1

        // Creating another Book object
        Book lotr = new Book();
        
        // Printing the updated total count
        System.out.println(Book.totalCount); // Should print 2
    }
}
