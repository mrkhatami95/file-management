package java8.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NonBlockingFile {

    public static void main(String[] args) throws IOException {
        createFileIn_NIO();
    }

    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());

        //or

        List<String> lines = Arrays.asList("1st line", "2nd line");

        Files.write(Paths.get("file6.txt"),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}
