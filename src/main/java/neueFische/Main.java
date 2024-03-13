package neueFische;

public class Main {
    static void main(String[] args){

        Book paulBook = new Book();
        paulBook.title = "Datengeraffel";
        paulBook.pages = 12;
        paulBook.author = "Erna Enstel";
        paulBook.coverColor = "Grey";
        paulBook.isbn = "328-2-442, 2780-4";

        Book ernaBook = new Book("Das merke ich mir!", 383, "Paul Paulsen", "White", "978-3-442, 1780-6");

        printBooksInfo(paulBook);
        printBooksInfo(ernaBook);
    }



    public static void printBooksInfo(Book book){
        System.out.println(
                "Das Buch " + book.title + "des Author " + book.author + " hat eine Seitenanzahl " + book.pages + " mit einem Farbcover in " + book.coverColor + " ISBN " + book.isbn  );
    }

}
