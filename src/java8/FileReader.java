package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("input.txt"));

        List<String> content = lines.collect(Collectors.toList());

        content.forEach(x -> System.out.println(x));

    }

}
