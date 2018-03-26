package com.learnjavacollection.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangszuyung on 2018/03/26
 */
public class CollectionMethod {
    public static void example1() {
        List<String> ls = new LinkedList<>();

        // Help us to locate the point where we add wrong type of object to a collection.
        ls = Collections.checkedList(ls, String.class);
        ls.add("Fred");
        ls.add("Jim");
        for (String s : ls) {
            System.out.println("Found item " + s);
        }
        breakIt(ls);
        for (String s : ls) {
            System.out.println("Found item " + s);
        }
    }

    private static void breakIt(List ls) {
        ls.add(1);
    }
}
