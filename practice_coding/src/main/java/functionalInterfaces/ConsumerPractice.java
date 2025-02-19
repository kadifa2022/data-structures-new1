package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Max", "Josh","Breann", "Haily", "James", "Ahmet","Muhtar", "Shay" ));
        names.forEach((p) -> {
            if(p.startsWith("J"))
            System.out.println(p);
        });

    }
}
