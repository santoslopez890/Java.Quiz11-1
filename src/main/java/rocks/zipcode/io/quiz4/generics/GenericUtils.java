package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */

import java.util.*;

public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        List<T> setList = new ArrayList<>(originalSet);
        List<List<T>> result = new ArrayList<>();
        generatePowerSet(setList, 0, new ArrayList<>(), result);
        return result;
    }

    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        Set<T> set = new TreeSet<>(Arrays.asList(originalSet));
        return powerSet(set);
    }

    private static <T extends Comparable<T>> void generatePowerSet(List<T> setList, int index, List<T> currentSet, List<List<T>> result) {
        if (index == setList.size()) {
            result.add(new ArrayList<>(currentSet));
            return;
        }

        T currentElement = setList.get(index);

        // Include the current element in the subset
        currentSet.add(currentElement);
        generatePowerSet(setList, index + 1, currentSet, result);

        // Exclude the current element from the subset
        currentSet.remove(currentElement);
        generatePowerSet(setList, index + 1, currentSet, result);
    }
}


