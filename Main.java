class Book {
    int BookId;
    String title;
    String author;
    String category;
    double price;
    boolean avaiable;

    Book(int BookId, String title, String author, String category, double price, boolean avaiable) {
        this.BookId = BookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.avaiable = avaiable;
    }

    void displayBookDetails() {
        System.out.println("BookId: " + BookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + avaiable);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "JavaBasics", "James", "Programming", 450.0, true);
        Book b2 = new Book(102, "PythonGuide", "Guide", "Programming", 550.0, false);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}