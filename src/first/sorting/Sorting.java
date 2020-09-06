package first.sorting;


public class Sorting{
    private interface IComparator {
        boolean compare(int x, int y);
    }

    public static int[] bubbleSortAsc(int[] array){
        return Sorting.bubbleSort(array,true);
    }

    public static int[] bubbleSortDesc(int[] array){
        return Sorting.bubbleSort(array,false);
    }

    //пузырьковая сортировка
    private static  int[] bubbleSort(int[] array,boolean ascending){

        if(array.length<=1){
            return array;
        }

        final IComparator comparator = ascending ? (int x, int y) ->  x > y
            : (int x, int y) -> x < y;

        for(int i=0;i< array.length;i++){
            for(int y=i+1;y<array.length;y++){
                if(comparator.compare(array[i],array[y])){
                    int swap=array[i];
                    array[i]=array[y];
                    array[y]=swap;
                }
            }
        }
        return array;
    }
}
