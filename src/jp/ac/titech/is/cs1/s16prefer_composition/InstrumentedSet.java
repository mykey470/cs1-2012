package jp.ac.titech.is.cs1.s16prefer_composition;

import java.util.Set;

public interface InstrumentedSet<E> extends Set<E> {
    public int getCount();
}
