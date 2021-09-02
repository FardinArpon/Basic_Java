package P5_File_Read_Write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Read_Write {
    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
    }

    public static void writeFile() throws IOException {
        FileWriter fw = new FileWriter("MyFile.txt", true);
        fw.write("Hello World");
        fw.write("\r\n");   // write new line
        fw.write("Hello Arpon");
        fw.close();
    }

    public static void readFile() throws IOException {
        FileReader reader = new FileReader("MyFile.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}