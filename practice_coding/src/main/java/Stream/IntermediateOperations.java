package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {

        System.out.println("distinct(): return the distinct " +
                "element in stream after eliminating the duplicates");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3));

       list1 = list1.stream().distinct().collect(Collectors.toList());
       System.out.println(list1);

        System.out.println("skip(n): --returns the elements in the stream " +
                "after skipping the first n elements");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,3,4,5,6,7,8,9));
        list2 = list2.stream().skip(2).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("Limit(n): returns first n elements in the stream");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list3 = list3.stream().limit(5).collect(Collectors.toList());
        System.out.println(list3);


        System.out.println("map(Function): used for transforming the elements in the stream" +
                " by applying the specified Function");
        List<Integer>  list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

       list4 =  list4.stream().map(p -> {
           if(p%2 != 0) return p * 2; else return p;}).collect(Collectors.toList());
        System.out.println(list4);

        System.out.println("filter(predicate) used for filtering the elements in stream" +
                " by applying the specific Predicate condition");

        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list5 = list5.stream().filter(p -> p % 3 == 0).collect(Collectors.toList());
        System.out.println(list5);

        System.out.println("Sorted(): used for sorting the elements in the stream");

        List<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(20, 10, 9, 15, 12, 0, 1, 3, 4, 5));
        list6 = list6.stream().sorted().collect(Collectors.toList());
        System.out.println(list6);

        System.out.println("peek(Consumer) : return the elements in the stream after " +
                "performing the specific operation on each element of the stream");

        List<Integer> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        list7 = list7.stream().filter(p -> p % 5 == 0).peek(p -> System.out.println(p))
                .collect(Collectors.toList());
        System.out.println(list7);


    /*
    TasK:

    1. Eliminate duplicates
    2. Find the strings that start with "J" Only
    3. Converter them all to upper case
    4. store them into new list
    */

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "JavaScript","Python","Java", "C#", "JavaScript", "Java",
                "TypeScript", "Python", "JSON", "JASON"));

        List<String> result = words.stream()
                .distinct()
                .filter(p->p.startsWith("J"))
                .map(p->p.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(words);
        System.out.println(result);










    }
}
