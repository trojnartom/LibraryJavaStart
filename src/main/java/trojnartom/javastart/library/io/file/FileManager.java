package trojnartom.javastart.library.io.file;

import trojnartom.javastart.library.model.Library;

public interface FileManager {

    Library importData();
    void exportData(Library library);
}
