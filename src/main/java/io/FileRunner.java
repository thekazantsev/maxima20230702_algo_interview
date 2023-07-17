package io;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/io/file.txt");
        file.createNewFile();
    }
}
