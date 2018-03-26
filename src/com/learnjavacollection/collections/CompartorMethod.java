package com.learnjavacollection.collections;

import com.learnjavacollection.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author wangszuyung on 2018/03/26
 */
public class CompartorMethod {
    public static void example1() {
        List<Name> ln = new ArrayList<>(Arrays.asList(
            new Name("Fred", "Jones"),
            new Name("Jim", "Anderson"),
            new Name("Shiela", "Jones"),
            new Name("Fred", "Smith"),
            new Name("Fred", "Anderson"),
            new Name("Jim", "Jones"),
            new Name("Sheila", "Anderson")
        ));

        Comparator<Name> byLast = (a, b) -> a.getLast().compareTo(b.getLast());
        Comparator<Name> byFirst = (a, b) -> a.getFirst().compareTo(b.getFirst());
        ln.sort(byLast.thenComparing(byFirst));
        ln.forEach(n -> System.out.println(n));
        System.out.println("------------------------");
        ln.sort(byLast.thenComparing(x -> x.getFirst(), Comparator.reverseOrder()));
        ln.forEach(n -> System.out.println(n));
    }
}
