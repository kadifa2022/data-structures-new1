package functionalInterfaces;

import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {

        Predicate<Integer> isEven = p -> p % 2 == 0;
        boolean r1 = isEven.test(10);
        System.out.println(r1);


        Predicate<String> isPalindrome = (str) -> {
            String reversed = ""; // compare with given string
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            boolean result = str.equalsIgnoreCase(reversed);
            return result;

        };
      boolean r2 = isPalindrome.test("racecar");
        System.out.println(r2);


    }
}