package com.learnjavacollection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Johnny on 2018/3/26.
 */

class Student implements Comparable<Student> {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return grade.compareTo(o.grade);
    }
}

public class QueueMethod {
    public static void example1() {
        Queue<String> q = new ArrayDeque<>();
        q.add("John");
        q.add("Fred");
        q.add("Jim");
    }

    public static void example2() {
        Queue<Student> q = new PriorityQueue<>();
        q.add(new Student("Fred", "F"));
        q.add(new Student("John", "D"));
        q.add(new Student("Jim", "A"));
        q.add(new Student("Jo", "A"));
        q.add(new Student("William", "B"));
        System.out.println(q);
        while (q.size() > 0) {
            System.out.println(q.remove());
        }
    }
}
