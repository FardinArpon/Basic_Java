package P5_File_Read_Write;

import java.io.FileReader;
import java.io.IOException;

public class File_Read {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("MyFile.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}


