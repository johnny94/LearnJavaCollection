package com.learnjavacollection.sortedset;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author wangszuyung on 2018/03/26
 */
public class SortedSetMethod {
    public static void example1() {
        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(1, 9, 3, 4, 5, 6, 10));
        System.out.println(set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("head, up to 6: " + set.headSet(6));
        System.out.println("tail, from 6: " + set.tailSet(6));

        Set<Integer> subset = set.subSet(3, 9);
        System.out.println("subset: " + subset);
        set.add(7);
        System.out.println("subset: " + subset);

        // For lower(<), floor(<=), ceiling(>=), and higher(>) operations we can use NavigableSet
        NavigableSet<Integer> nav = (NavigableSet) set;
        System.out.println("floor(2) " + nav.floor(2));
        System.out.println("floor(3) " + nav.floor(3));
        System.out.println("lower(2) " + nav.lower(2));
        System.out.println("lower(3) " + nav.lower(3));
    }
}
