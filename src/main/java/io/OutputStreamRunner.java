package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "main", "java", "io", "outputLog.txt").toFile();

        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            String value = "Some information...";
            fileOutputStream.write(value.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());

        }
    }
}
