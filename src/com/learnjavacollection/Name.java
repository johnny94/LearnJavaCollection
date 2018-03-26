package com.learnjavacollection;

/**
 * @author wangszuyung on 2018/03/26
 */
public class Name {
    private String first;

    private String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "Name{" +
            "first='" + first + '\'' +
            ", last='" + last + '\'' +
            '}';
    }
}





