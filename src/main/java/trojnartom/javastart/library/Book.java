package trojnartom.javastart.library;

public class Book {

    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
