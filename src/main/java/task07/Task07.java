/**
 *Выведите новый список, содержащий первый и последний элемент изначального списка.
 */

package task07;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("first", "second", "third", "last"));

        ArrayList<String> newStringList = new ArrayList<>();

        newStringList.add(stringList.get(0));
        newStringList.add(stringList.get(stringList.size() - 1));


        ArrayList<String> newStringList2 = new ArrayList<>();

        for (int i = 0; i > -2; i--) {
            newStringList2.add(stringList.get((stringList.size() - 1) * Math.abs(i)));
        }

        System.out.println("newStringList: " + newStringList);
        System.out.println("newStringList2: " + newStringList2);
    }
}
