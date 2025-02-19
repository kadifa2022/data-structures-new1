package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,1,1,2,2,3,3,4,5,6,6,7));

        Predicate<Integer> isEven = p -> p % 2 == 0;

//
//            // can be this way to return true
//            if (p % 2 == 0) {
//                return true;
//            } else {
//                return false;
//            }



      list.removeIf(isEven);// takes predicate
        System.out.println(list);

    }
}
