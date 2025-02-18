package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Izabela");

        // Iterating by keys:
        // keySet(): returns all the keys of the map(set)

        for (Integer eachSet : linkedHashMap.keySet()) {
            System.out.println(eachSet);

        }

        // Iterating by values() //return all values of the map(Collections)


        for (String mapValues: linkedHashMap.values()) {
            System.out.println(mapValues);

        }
        System.out.println("Iterating by EntrySet()------------");

        for (Map.Entry<Integer, String> eachEntry : linkedHashMap.entrySet()) {
            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());

        }




    }
}