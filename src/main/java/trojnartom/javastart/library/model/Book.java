package trojnartom.javastart.library.model;

public class Book {

    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this (title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher;
        if (isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }
}
