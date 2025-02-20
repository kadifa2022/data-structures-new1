package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamShort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.asList(2, 5, 3, 4, 3, 2, 5, 6, 7, 7, 8, 9, 10);


        Arrays.stream(arr);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();// creating the stream out Data source

        System.out.println("-----Commonly used Intermediate operations----------");
        //map(), filter(), distinct(), sorted(), limit()

        list.stream()
                .map(x -> x * x)
                .filter(x -> x > 15)
                .distinct()
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        System.out.println(list);

        System.out.println("-----Commonly used Terminal  operations----------");
        // forEach(), collect(), reduce(), count(), findFirst(),
        // findAny(), anyMatch(), allMatch()

        List<Integer> squares = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squares);

        int sum = list.stream()
                .map(x -> x * x)
                .reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("sum " + sum);

        long count = list.stream()
                .map(x -> x * x)
                .count();
        System.out.println("count  " + count);
// findFirst() and findAny() methods returns us first value from the SINGLE stream,
// if we are using parallel stream findFirst() returns us very first value of the stream,
        //findAny() returns us any value from parallel stream
        Integer findFirst = list.stream()
                .map(x -> x * x)
                .findFirst().get();
        System.out.println("Find First " + findFirst);

        Integer findAny = list.stream()
                .map(x -> x * x)
                .findAny().get();
        System.out.println("Find any " + findAny);


        boolean anyMatch = list.stream()
                .map(x -> x * x)
                .anyMatch(sq -> sq < 20);
        System.out.println("Any match :" + anyMatch);

        boolean allMatch = list.stream()
                .map(x -> x * x)
                .allMatch(sq -> sq < 20);
        System.out.println("All match :" + allMatch);




        System.out.println(list);


    }

}
