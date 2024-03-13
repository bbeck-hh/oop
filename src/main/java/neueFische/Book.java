package neueFische;

public class Book {

    String title;
    int pages;
    String author;
    String coverColor;
    String isbn;

    // Constructor
    public Book(String title, int pages, String author, String coverColor, String isbn) {
        // this.title kommt aus dem Kontext von Book
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.coverColor = coverColor;
        this.isbn = isbn;
    }
    // Default constructor -> NoArgsConstructor
    public Book(){

    }
}
