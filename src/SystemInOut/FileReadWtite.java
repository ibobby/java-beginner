package SystemInOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadWtite {

    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;

        try {
            fin = new FileInputStream("C:/1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            return;
        }

        do {
            i = fin.read();
            if (i != -1) System.out.println((char) i);
        } while (i != -1);

    }

}
