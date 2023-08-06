package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "main", "java", "io", "file.txt").toFile();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String collect = fileReader.lines()
                .collect(Collectors.joining("\n"));

//            System.out.println(collect);
        }

        //with Files
        Path filePath = Path.of("src", "main", "java", "io", "file.txt");

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(System.out::println);
        }
    }
}
