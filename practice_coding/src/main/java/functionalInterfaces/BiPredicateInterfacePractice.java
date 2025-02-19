package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateInterfacePractice {

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, num) -> {
            boolean result = false;
            for (int each : arr) {
                if (each == num) {
                    result = true;
                    break;
                }
            }
            return result;
        };

        int[] arr = {10,20,30,40};
        boolean r2 = contains.test(arr, 10);
        System.out.println(r2);
    }
}
