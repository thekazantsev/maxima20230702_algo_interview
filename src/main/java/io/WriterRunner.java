package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "main", "java", "io", "outputLog.txt").toFile();

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.append("Some new information");
            fileWriter.newLine();
            fileWriter.append("Some important information");
            fileWriter.newLine();

        }

        //with Files
        Path filePath2 = Path.of("src", "main", "java", "io", "outputLog2.txt");

        Files.write(filePath2, List.of("Some new information", "Some important information"));

    }
}
