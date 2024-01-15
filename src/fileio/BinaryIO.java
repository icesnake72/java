package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {

    public static void copy(String original, String dest) {
        byte[] buffer = new byte[1024];

        try(FileInputStream fis = new FileInputStream(original);
            FileOutputStream fos = new FileOutputStream(dest)) {
            int readBytes;
            while( (readBytes = fis.read(buffer)) != -1 ) {
                //
                fos.write(buffer, 0, readBytes);
            }
        } catch (IOException e) {
            System.out.println("파일 복사중에 오류가 발생했습니다.");
        }

    }
}
