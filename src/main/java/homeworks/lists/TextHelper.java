package homeworks.lists;

import homeworks.lists.comparators.ComparatorWords;
import homeworks.lists.iterators.InvertIterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextHelper {

    private static List<String> getWords(String text){
        List<String> words=new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я0-9]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group());
        }

        return  words;

    }

    public static int countWordInText(String text){
        List<String> words=getWords(text);
        System.out.println(words.size());
        return words.size();
    }

    public static Map<String, Long> countEveryWords(String text) throws IOException {

        List<String>words=getWords(text);
        Map<String, Long> wordsGrouped = words.stream()
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        return wordsGrouped;
    }

    public static void sortAndShowWords(String text){
        List<String> words= getWords(text);

        Comparator<String> speedComparator = new ComparatorWords();

        words.stream()
            .map(String::toLowerCase)
            .sorted(speedComparator)
            .forEach(System.out::println);
    }

    public static void reverseIterator(List<String> list){

        InvertIterator<String> reverseList = new InvertIterator<>(list);
        while (reverseList.iterator().hasNext()){
            for(String str: reverseList){
                System.out.println(str);
            }
        }
    }

    public static void showSpecifiedRows(List<Integer>rows,String text) throws Exception {

        List<String> rowsText = Arrays.stream(text.split("\\n"))
            .collect(Collectors.toList());

        for(Integer a: rows){
            if(a.intValue()>=rowsText.size()){
                throw new Exception("Введено число выходящее за пределы файла");
            }
        }

        rows.stream()
            .map(rowsText::get)
            .forEach(System.out::println);
    }

    public static void main(String[] args) throws Exception {
        List<String>file=Files.readAllLines(Paths.get(Environment.getEnvironment().getProperty("file")));
        String text= String.join("\n", file);

        reverseIterator(file);

        return;
//        Scanner sc = new Scanner(System.in);
//        int a=0;
//        List<Integer> rows=new ArrayList<Integer>();
//        while (a!=-1) {
//            System.out.println("Введите число:");
//            a = sc.nextInt();
//            if(a!=-1){
//                rows.add(a);
//            }
//        }
//        sc.close();
//        System.out.println(a);
//
//        showSpecifiedRows(rows,text);

    }
}
