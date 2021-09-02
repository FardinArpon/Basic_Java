package P5_File_Read_Write;

import java.io.FileWriter;
import java.io.IOException;

public class File_Write {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("MyFile.txt", true);
            fw.write("Hello World");
            fw.write("\r\n");   // write new line
            fw.write("Hello fardin");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
