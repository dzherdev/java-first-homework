package homeworks.wildcirds;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionUtils<T> {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static<T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> List<T> limit(List<? extends T> source, int size) {
        return source.stream().limit(size).collect(Collectors.toList());
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? extends T> removeFrom, List<? extends T> c2) {
        c2.stream().forEach(item->{
            int index= removeFrom.indexOf(c2);
            if(index>=0){
                removeFrom.remove(index);
            }
        });
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        return !Collections.disjoint(c1,c2);
    }

    public static<T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        return list
            .stream()
            .filter(e->e.compareTo(min)>=0 && e.compareTo(max)<=0)
            .collect(Collectors.toList());
    }

    public static<T> List range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        return list
            .stream()
            .filter(e->comparator.compare(e,min)>=0 && comparator.compare(e,max)<=0)
            .collect(Collectors.toList());
    }
}
