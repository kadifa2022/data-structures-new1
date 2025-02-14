package ArrayList;

import java.util.ArrayList;

public class IteratingArrayWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        for(Integer each : numbers){
            System.out.println(each);
        }
        System.out.println("-----------------");
        for (int each: numbers) {
            System.out.println(each);

        }
    }
}
