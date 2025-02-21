package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Terminal_Operations {

    public static void main(String[] args) {

        System.out.println("collect()");

        // collect(Collector): Collects  all elements of the stream and
        // returns them to specified type of collection

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

       list1 = list1.stream().filter(p->p%2 ==0)
                .collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("toArray()");

        // toArray(): Collects all the elements of the stream and return them as array
        int[] array = {1,2,3,4,5,6};
        array= Arrays.stream(array).filter(p->p > 4).map(p-> p * 10).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("count() frequency of the stream");
        //count(): returns the count of elements of the stream, returns type is long
        long n = Stream.of(1,2,3,4,5,6,7,8).count();
        System.out.println(n);
        // frequency of "Java"

       long m =  Stream.of("Java", "Java","C#", "Python", "Java")
                .filter(p-> p.equals("Java")).count();
        System.out.println(m);

        System.out.println("sum");
        // pass two Arguments ( initialIdentity (data), functional interface)
        // reduce(initialIdentity, BinaryOperator); combine the elements of
        // stream and returns them in a single value
        int [] arr = {1,2,3,4,5,6,8,9};
        int  sum  =  Arrays.stream(arr).reduce(0,(x, y) -> x + y);
        System.out.println(sum);


        String [] words = {"Java", "Python", "C#", "Java"};
        String s = Arrays.stream(words).reduce("", (a, b) -> a + ", " + b);
        System.out.println(s);

        System.out.println("forEach");


        //forEach(consumer) : iterates all the elements of the stream
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list2.stream().filter(p -> p > 4).forEach(p -> System.out.println(p));
        System.out.println("min"); //returns optional

        // min() : returns the min value of the stream
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Integer min = list3.stream().min(Integer::compareTo).get(); // if returns optional needs get()
        System.out.println(min);

        System.out.println("max");// returns optional .get()

        //max() : returns the maximum value of the stream
        List<Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(1, 2, 3, 5, 6, 8, 9, 7, 9, 4));

        Integer max = list4.stream().max(Integer::compareTo).get();
        System.out.println(max);

        //allMatch(Predicate): checks if all the elements in the stream
        // matches with the specified predicate

        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,9));
        boolean r1 =list5.stream().allMatch(p-> p > 0);// check if all # are positive
        System.out.println(r1);

        // anyMatch(predicate) : checks if any element in the
        // stream matches with the specified predicate
        List<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        boolean r2 = list2.stream().anyMatch(p -> p > 9);
        System.out.println(r2);

        //nonMatch(predicate): checks if no element in the
        // stream matches with the specified predicate
        List<Integer> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        boolean r3 = list7.stream().noneMatch(p -> p > 10);
        System.out.println(r3);


    }
}
