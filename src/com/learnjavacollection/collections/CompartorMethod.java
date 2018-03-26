package com.learnjavacollection.collections;

import com.learnjavacollection.Name;
import com.learnjavacollection.Student;

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
                new Name("Sheila", "Jones"),
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

    public static void example2() {
        List<String> ls = new ArrayList<>(Arrays.asList(
                "Sheila", null, "Fred", "Jim"
        ));
        ls.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(ls);
    }

    public static void example3() {
        List<Student> ls = new ArrayList<>(Arrays.asList(
                new Student("Fred", "here", 3.4f),
                new Student(null, "here", 3.5f),
                new Student("Jim", "here", 3.2f),
                new Student("Sheila", "there", 3.8f)
        ));

        ls.sort(Student.nameComparator());
        ls.forEach(s -> System.out.println(s));
    }
}
