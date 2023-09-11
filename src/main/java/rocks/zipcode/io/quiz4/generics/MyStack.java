package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    private ArrayList<SomeType> myStack;
    public MyStack() {
myStack=new ArrayList<>();
    }

    public Boolean isEmpty() {
        return myStack.isEmpty();
    }

    public void push(SomeType i) {
        myStack.add(i);
    }

    public SomeType peek() throws EmptyStackException{
        if(myStack.isEmpty()){
            EmptyStackException EmptyStackException = new EmptyStackException();
            throw EmptyStackException;
        }
        return myStack.get(myStack.size()-1);

    }

    public SomeType pop() throws EmptyStackException {
        if(myStack.isEmpty()){
            EmptyStackException EmptyStackException = new EmptyStackException();
            throw EmptyStackException;
        }
        return myStack.remove(myStack.size() - 1);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return Iterable.super.spliterator();
    }
}
