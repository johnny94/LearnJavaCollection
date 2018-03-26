package com.learnjavacollection.map;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Johnny on 2018/3/26.
 */
public class MapMerge {
    public void test() {
        Map<String, Integer> shop1 = new HashMap<>();
        shop1.put("Fred", 1);
        shop1.put("Jim", 3);
        shop1.put("Alice", 2);

        Map<String, Integer> shop2 = new HashMap<>();
        shop2.put("Fred", 2);
        shop2.put("Jim", 1);
        shop2.put("Alice", 5);

        Map<String, Integer> shop3 = new HashMap<>();
        shop3.put("Fred", 1);
        shop3.put("Jim", 2);
        shop3.put("Alice", 2);

        Map<String, Integer> total = new HashMap<>();

        List<Map<String, Integer>> stores = new ArrayList<>();
        stores.addAll(Arrays.asList(shop1, shop2, shop3));
        for (Map<String, Integer> shop : stores) {
            shop.forEach((k, v) -> total.merge(k, v, (v1, v2) -> v1 + v2));
        }

        total.forEach((k, v) -> System.out.printf("%s spent %d\n", k, v));

    }
}
