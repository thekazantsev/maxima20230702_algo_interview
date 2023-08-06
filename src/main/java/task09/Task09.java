/**
 *Напишите программу, которая вернет новый список, который содержит четные числа из заданного списка
 * и останавливается если \ добавляет до тех пор, пока … встречает число 237.
 */

package task09;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 12, 3, 4, 237, 6, 17));
        ArrayList<Integer> newNumbersList = new ArrayList<>();

        for(int number : numbersList) {
            if (number == 237) break;
            if (number % 2 == 0) newNumbersList.add(number);
        }

        System.out.println("numbersList: " + numbersList);
        System.out.println("newNumbersList: " + newNumbersList);
    }
}
