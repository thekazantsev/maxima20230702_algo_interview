/**
 *Напишите программу, которая принимает два списка и возвращает новый список,
 * который содержит все элементы первого, которых нет во втором.
 */

package task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8, 9, 3, 4, 5, 6, 11));
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int element: list1) {
            if (!list2.contains(element)) {
                list3.add(element);
            }
        }

        System.out.println("list3: " + list3);

        List<Integer> list4 = list1.stream()
            .filter(element -> !list2.contains(element))
            .toList();

        System.out.println("list4: " + list4);
    }
}
