package functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerInterfacePractice {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i< n; i++){
                System.out.println(s);
            }
        };
         printMultipleTimes.accept("Wooden Spoon", 1);



    }
}
