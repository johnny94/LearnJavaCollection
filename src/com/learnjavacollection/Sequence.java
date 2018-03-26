package com.learnjavacollection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Johnny on 2018/3/21.
 */

class SequenceIterator implements Iterator<Integer> {
    private Sequence sequence;
    private int nextValue;

    public SequenceIterator(Sequence sequence) {
        this.sequence = sequence;
        this.nextValue = sequence.start;
    }

    @Override
    public boolean hasNext() {
        return this.nextValue <= this.sequence.limit;
    }

    @Override
    public Integer next() {
        if (this.sequence.limit < this.nextValue) {
            throw new NoSuchElementException("No such element");
        }
        int rv = this.nextValue;
        this.nextValue += this.sequence.increment;
        return rv;
    }
}

public class Sequence implements Iterable<Integer> {
    final int start, increment, limit;

    public Sequence(int start, int increment, int limit) {
        this.start = start;
        this.increment = increment;
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(this);
    }
}
