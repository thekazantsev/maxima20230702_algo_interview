package task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * Даны списки: a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]; b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13].
 * Нужно вернуть список, который состоит из элементов, общих для этих двух списков.
 */

public class Task03 {
    public static void main(String[] args) {


        List<Integer> integerList1 = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        List<Integer> integerList2 = IntStream.rangeClosed(1, 13).boxed().toList();


        List<Integer> commonElementsList1 = commonElementsV1(integerList1, integerList2);
        for (Integer current : commonElementsList1) {
            System.out.println(current);
        }

        System.out.println("==========================================");

        commonElementsV2(integerList1, integerList2).forEach(System.out::println);
    }

    private static <T> List<T> commonElementsV1(List<T> integerList1, List<T> integerList2) {
        List<T> resultList = new ArrayList<>();
        for (T current : integerList1) {
            if (integerList2.contains(current) && !resultList.contains(current)) {
                resultList.add(current);
            }
        }
        return resultList;
    }

    private static <T> List<T> commonElementsV2(List<T> integerList1, List<T> integerList2) {
        return integerList1.stream()
            .distinct()
            .filter(integerList2::contains)
            .toList();
    }
}
