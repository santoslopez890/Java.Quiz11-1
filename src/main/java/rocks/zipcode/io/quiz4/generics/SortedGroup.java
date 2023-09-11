package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    @Override
    public void insert(T value) {
        // Find the index where the value should be inserted to maintain sorted order
        int index = Collections.binarySearch(newList, value);
        // If index is negative, convert it to the insertion point
        if (index < 0) {
            index = -index - 1;
        }

        // Insert the value at the determined index
        newList.add(index, value);
    }

    @Override
    public void delete(T value) {
        // Simply remove the value from the list
        newList.remove(value);
    }

    public Integer indexOf(T value) {
        // Use binary search to find the index of the value
        int index = Collections.binarySearch(newList, value);

        // If the value is found, return its index; otherwise, return -1
        return index >= 0 ? index : -1;
    }
}

