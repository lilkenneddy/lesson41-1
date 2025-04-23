package org.example;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <integer> void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);
        originalMap.put("D", 2);


        Map<Integer, String> invertedMap = invertMap(originalMap);
        System.out.println("Оригінальна мапа: " + originalMap);
        System.out.println("Інверсована мапа: " + invertedMap);
    }

    public static Map<Integer, String> invertMap(Map<String, Integer> originalMap) {
        Map<Integer, String> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }
}