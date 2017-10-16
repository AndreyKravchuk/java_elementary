package edu.hillel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class HillelMultiSet<T> implements Set<T>{

    private ArrayList<T> multiSet;

    public HillelMultiSet(){
        this.multiSet = new ArrayList<T>();
    }

    public int size() {
        int sizeOfMultiSet = multiSet.size();
        return sizeOfMultiSet;
    }

    public boolean isEmpty() {
        return multiSet.size() == 0;
    }

    public boolean contains(Object o) {
        return multiSet.contains(o);
    }

    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < multiSet.size() && multiSet.isEmpty() == false;
            }

            @Override
            public T next() {
                return multiSet.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    public Object[] toArray() {
        Object[] arrList = multiSet.toArray();
        return arrList;
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    public boolean add(T t) {
        multiSet.add(t);
        return true;
    }


    public boolean remove(Object o) {
        boolean result = false;
        for (int i = 0; i < multiSet.size(); i++){
            Object element = multiSet.get(i);
            if (element.equals(o)) {
                multiSet.remove(element);
                result = true;
                break;
            }
        }
        return result;
    }

    public int removeAllElements(Object o) {
        int result = 0;
        while (remove(o)){

            multiSet.remove(o);
            ++result;
        }
        return result;
    }

    public int countElements(Object o){
        int count = 0;
        for (int i = 0; i < multiSet.size(); i++){
            if (multiSet.get(i).equals(o)){

                count ++;
            }
        }
        return count;
    }

    public HillelMultiSet<T> intersect(HillelMultiSet<T> ms){
        HillelMultiSet<T> intersect = new HillelMultiSet<T>();
        for (int i = 0; i < ms.multiSet.size(); i++){
            if (this.multiSet.contains(ms.multiSet.get(i))){
                intersect.add(ms.multiSet.get(i));
            }
        }
        return intersect;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public void clear() {


    }
}
