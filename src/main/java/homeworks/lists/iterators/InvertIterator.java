package homeworks.lists.iterators;


import java.util.Iterator;
import java.util.List;

public class InvertIterator<T> implements Iterable<T> {

    private List<T> list;
    private Iterator<T> iterator;

    public InvertIterator(List<T> list){
        this.list=list;
        iterator =new Iterator<T>() {
            private int currentIndex=list.size()-1;
            @Override
            public boolean hasNext() {
                return currentIndex>=0;
            }

            @Override
            public T next() {
                return list.get(currentIndex--);
            }
        };
    }

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }
}
