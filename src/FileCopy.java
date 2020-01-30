import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String args[]) throws IOException {

        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")){
            byte[] bytes = new byte[]{12,12,3,124,12,4,24,24,24,1,24,55,23,12,13};
            int c;
            while ((c = in.read(bytes)) != -1) {
                out.write(c);
            }
        }

        System.err.println("Files copied!");
    }
}
