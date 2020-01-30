import java8.nio.Student;

import java.io.*;
import java.util.Formatter;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\test.txt");

        BufferedReader br = new BufferedReader(new java.io.FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

        file.getAbsoluteFile();
        file.canRead();

        String data = "Test data";

        Student student = new Student();

        FileOutputStream out = new FileOutputStream("d://test.txt");
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("d://test.txt"));
        out2.writeObject(student);

        out.write(student.toString().getBytes());
        out.close();
    }
}
