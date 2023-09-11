package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>,GroupInterface<_>{
    List<_> newList;
    public Group() {
        newList=new ArrayList<>();

    }

    public Integer count() {
        return newList.size();
    }

    public void insert(_ value) {
        newList.add(value);
    }

    public Boolean has(_ value) {
        return newList.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return newList.get(indexOfValue-1);
    }

    public void delete(_ value) {
        newList.remove(value);
    }

    public void clear() {
        newList.clear();
    }

    public Iterator<_> iterator() {
        return newList.iterator();
    }

    @Override
    public String toString() {
        return newList.toString();
    }
}
