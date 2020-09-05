package sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting{

    private static List<String> sort(List<String> array){

        return array;
    }
    //пузырьковая сортировка
    private static  int[] bubbleSort(int[] array){
        List<String> a;
        for(int i=0;i< array.length;i++){
            for(int y=i+1;y<array.length;y++){
                if(array[i] > array[y]){
                    int swap=array[i];
                    array[i]=array[y];
                    array[y]=swap;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("asd");
        list.add("asd");
        list.add("asd");

        sort(list);


        int[] array={3,1,2,5,6};

        for (int a : bubbleSort(array)) System.out.println(a);
    }
}
