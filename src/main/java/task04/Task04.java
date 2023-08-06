package task04;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Напишите программу для слияния нескольких словарей в один.
 */

public class Task04 {
    public static void main(String[] args) {

        Map<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(1, "One");
        hashMap1.put(2, "Two");
        hashMap1.put(4, "Four");
        hashMap1.put(6, "Six");

        Map<Integer, String> hashMap2 = new HashMap<>();
        
        hashMap2.put(1, "One");
        hashMap2.put(3, "Three");
        hashMap2.put(5, "Five");
        hashMap2.put(7, "Seven");

        joinMapsWay1(hashMap1, hashMap2);

        joinMapsWay2(hashMap1, hashMap2);

        joinMapsWay3(hashMap1, hashMap2);
    }

    private static void joinMapsWay1(Map<Integer, String> hashMap1, Map<Integer, String> hashMap2) {
        Map<Integer, String> resultMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : hashMap1.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : hashMap2.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(resultMap);
    }

    private static void joinMapsWay2(Map<Integer, String> hashMap1, Map<Integer, String> hashMap2) {
        Map<Integer, String> resultMap = new HashMap<>();

        resultMap.putAll(hashMap1);
        resultMap.putAll(hashMap2);

        System.out.println(resultMap);
    }

    private static void joinMapsWay3(Map<Integer, String> hashMap1, Map<Integer, String> hashMap2) {
        Map<Integer, String> resultMap = new HashMap<>();

        Stream.of(hashMap1, hashMap2)
            .flatMap(map -> map.entrySet().stream())
            .forEach(entry -> resultMap.put(entry.getKey(), entry.getValue()));

        System.out.println(resultMap);
    }
}
