package wildcards;

import homeworks.first.hierarchy.Figure;
import homeworks.wildcirds.CollectionUtils;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectionUtilsTest {

    @Test
    public void indexOfTest(){
        List<Number> numberTest= new ArrayList<>();
        numberTest.add(1);
        numberTest.add(2);
        numberTest.add(3);

        int index = CollectionUtils.indexOf(numberTest,new Integer(2));
        System.out.println(index);
    }
}
