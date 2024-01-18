// Create a class called Book with the following attributes and methods:

// Attributes: title (String), author (String), isbn (String), numPages (int).
// Methods:
// displayInfo() method that prints out the information about the book, including title, author, ISBN, and number of pages.
// Implement a constructor for the Book class to initialize the attributes.

// Create an instance of the Book class, set some initial values, and call the displayInfo() method to print out the book details.



public class Book {
    private String title;
    private String author;
    private String isbn;
    private int numPages;

    // Constructor
    public Book(String title, String author, String isbn, int numPages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numPages = numPages;
    }

    // DisplayInfo method
    public void displayInfo() {
        System.out.println("Title of book: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Number of Pages: " + numPages);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Harry Potter and the Hogwarts", "Golden Boy", "hp10867882023", 202);

        myBook.displayInfo();
    }
}

