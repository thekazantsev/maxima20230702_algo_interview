package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "main", "java", "io", "file.txt").toFile();

        //1
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytesFromFile = fileInputStream.readAllBytes(); //считывание в оперативную память
            String stringValueFromFile = new String(bytesFromFile);
//            System.out.println(stringValueFromFile);
        }

        //2
        try (FileInputStream fileInputStream2 = new FileInputStream(file)) {
            byte[] bytes = new byte[fileInputStream2.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream2.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
