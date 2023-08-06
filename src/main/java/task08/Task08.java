/**
 *Напишите программу, которая принимает имя файла и возвращает его расширение.
 * Если расширение у файла определить невозможно, выбросите исключение.
 */

package task08;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.print("Введите имя файла с расширением: ");
        String inputLine = new Scanner(System.in).nextLine();

        try {
            if (!inputLine.contains("."))
                throw new NoTypeException("Filename not contains type");
        } catch (NoTypeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        int pointIndex = inputLine.lastIndexOf(".");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = pointIndex + 1; i < inputLine.length(); i++) {
            stringBuilder.append(inputLine.charAt(i));
        }

        System.out.println("Типа файла: " + stringBuilder);
    }
}
