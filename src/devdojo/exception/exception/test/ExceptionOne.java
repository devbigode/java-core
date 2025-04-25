package devdojo.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionOne {

    public static void createFile(File file) throws IOException {
        boolean wasCreated = file.createNewFile();

        if (wasCreated){
            System.out.println("Arquivo criado com sucesso!✅");
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("files\\test.txt");

        createFile(file);
    }
}
