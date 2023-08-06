package task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Есть список a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89].
 * Вернуть новый список, все элементы, которые меньше 5.
 */

public class Task02 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

        List<Integer> integerListLess5 = lessThan5Method2(integerList);
        for (Integer current : integerListLess5) {
            System.out.println(current);
        }
    }

    private static List<Integer> lessThan5Method1 (List<Integer> integerList) {
        List<Integer> integerListLess5 = new ArrayList<>();
        for (Integer current : integerList) {
            if (current < 5) {
                integerListLess5.add(current);
            }
        }
        return integerListLess5;
    }

    private static List<Integer> lessThan5Method2 (List<Integer> integerList) {
        return integerList.stream()
            .filter(i -> i < 5)
            .collect(Collectors.toList());
    }
}
