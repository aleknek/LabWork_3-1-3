import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileCopy {

    public void copyFile(String source, String destination) {

        try {

            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(destination);

            int c = 0;
            while (true) {
                c = fileInputStream.read();
                if (c != -1)
                    fileOutputStream.write(c);
                else
                    break;
            }

            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
