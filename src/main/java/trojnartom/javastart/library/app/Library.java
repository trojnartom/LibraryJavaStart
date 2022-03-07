package trojnartom.javastart.library.app;

import trojnartom.javastart.library.io.DataReader;
import trojnartom.javastart.library.model.Book;

import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book [] books = new Book[1000];

        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();

    }
}
