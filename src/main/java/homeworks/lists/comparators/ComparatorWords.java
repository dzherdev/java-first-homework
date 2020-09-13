package homeworks.lists.comparators;

import java.util.Comparator;

public class ComparatorWords implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result;
        int diffLength= o2.length() - o1.length();
        if(diffLength==0){
            result=  o1.compareTo(o2);
        }else{
           result= diffLength;
        }

        return result;
    }
}
