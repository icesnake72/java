package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextIO {

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try (FileWriter fWriter = new FileWriter(file)) {
            fWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static StringBuilder read(String fileName) throws IOException {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        try(FileReader fReader = new FileReader(file)) {
            // fReader.read(); // 한 글자씩 읽음
            char[] buffer = new char[128];
            int readBytes;
            while( (readBytes = fReader.read(buffer))!=-1 ) {
                String str = new String(buffer, 0, readBytes);
                sb.append( str );
            }
        } catch (IOException e) {
            throw e;
        }

        return sb;
    }
}
