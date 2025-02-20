package functionalInterfaces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BiConsumerInterfacePractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        map.forEach((k,v) -> {
            if(v >= 30) {
                System.out.println(k + ", " + v);
            }

        } );
    }
}
