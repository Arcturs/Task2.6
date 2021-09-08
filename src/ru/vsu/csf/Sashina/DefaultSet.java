package ru.vsu.csf.Sashina;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface DefaultSet<T> extends Set<T> {

    @Override
    default int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean add(T e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
