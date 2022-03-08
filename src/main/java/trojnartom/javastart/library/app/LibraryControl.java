package trojnartom.javastart.library.app;

import trojnartom.javastart.library.io.DataReader;
import trojnartom.javastart.library.model.Book;
import trojnartom.javastart.library.model.Library;

public class LibraryControl {

    private DataReader dataReader = new DataReader();
    private Library library = new Library();
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    public void controlLoop () {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu, papa!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }

}
