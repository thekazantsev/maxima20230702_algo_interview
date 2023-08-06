/**
 *Вы принимаете от пользователя последовательность чисел, разделенных запятой.
 *Верните список и кортеж с этими числами.
 */

package task06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введите целые числа, используя запятую в качестве разделителя: ");
        String inputLine = new Scanner(System.in).nextLine();

        String[] stringArray = inputLine.split(",");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        ArrayList<Integer> integerList = new ArrayList<>();
        for (int number : intArray) {
            integerList.add(number);
        }

        /*streams*/

        int[] intArray2 = Arrays.stream(stringArray)
            .mapToInt(Integer::parseInt)
            .toArray();

        ArrayList<Integer> integerList2 = Arrays.stream(intArray2)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> integerList3 = Arrays.stream(stringArray)
            .map(Integer::parseInt)
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("intArray: " + Arrays.toString(intArray));

        System.out.println("integerList: " + integerList);

        System.out.println("intArray2: " + Arrays.toString(intArray2));

        System.out.println("integerList2: " + integerList2);

        System.out.println("integerList3: " + integerList3);
    }
}
