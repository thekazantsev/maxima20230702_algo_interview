/**
 *Верните список файлов в указанной директории.
 */

package task11;

import java.io.File;
import java.nio.file.Path;

public class Task11v1 {
    public static void main(String[] args) {
        File directory = Path.of("src", "main", "java", "io").toFile();

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
