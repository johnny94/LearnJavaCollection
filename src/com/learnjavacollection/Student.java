package com.learnjavacollection;

import java.util.Comparator;

/**
 * @author wangszuyung on 2018/03/26
 */
public class Student {
    private String name;

    private String address;

    private float gpa;

    public Student(String name, String address, float gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    private static final Comparator<Student> gradeComparator = new GradeComparator();

    public static Comparator<Student> GradeComparator() {
        return gradeComparator;
    }

    private static class GradeComparator implements java.util.Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Float.compare(o1.gpa, o2.gpa);
        }
    }

    private static final Comparator<Student> nameComparator = new NameComparator();

    public static Comparator<Student> nameComparator() {
        return nameComparator;
    }

    private static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", gpa=" + gpa +
            '}';
    }
}
