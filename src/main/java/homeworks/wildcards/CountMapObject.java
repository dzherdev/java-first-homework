package homeworks.wildcirds;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CountMapObject<T> implements CountMap<T> {

    private Map<String, Integer> map=new HashMap<>();

    @Override
    public void add(T o) {
        Integer count = this.map.get(o);
        if (count.equals(null)) {
            count=0;
        }
        this.map.put(o.getClass().toString(),++count);
    }

    @Override
    public int getCount(T o) {
        Integer count = this.map.get(o.getClass().toString());
        if(count.equals(null)){
            count=0;
        }
        return count;
    }

    @Override
    public int remove(T o) {
        int count=this.getCount(o);
        this.map.remove(o.getClass().toString());
        return count;
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        source.toMap().forEach((String key,Integer count)->{
            this.map.put(key,this.map.get(key)+count);
        });
    }

    @Override
    public Map<String,Integer> toMap() {
        return this.map;
    }

    @Override
    public void toMap(Map<String,Integer> destination) {
        this.map.forEach((String key,Integer count)->{
            destination.put(key,this.map.get(key)+count);
        });
        this.map=destination;
    }
}
