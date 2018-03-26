package com.learnjavacollection.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author wangszuyung on 2018/03/26
 */
public class DequeMethod {
    public static void example1() {
        List<String> ls = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Deque<String> stack = new ArrayDeque<>();
        for (String s : ls) {
            stack.push(s);
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
