package by.lesson.practics.class8;

import java.util.*;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        // 1. Заполнить HashMap 10 объектами <Integer, String>
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grape");
        map.put(6, "strawberry");
        map.put(7, "blueberry");
        map.put(8, "cherry");
        map.put(9, "watermelon");
        map.put(10, "pineapple");
        map.put(11, "mango");

        // Найти строки у которых ключ>5, вывести через запятую
        List<String> result = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                result.add(entry.getValue());
            }
        }
        System.out.println("Строки с ключом > 5: " + String.join(", ", result));

        // 1.1 Перемножить все ключи, у которых строка состоит из более чем 5 элементов
        long product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }
        System.out.println("Произведение ключей (строка > 5 элементов): " + product);
    }
}