package map;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MapMethods {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        //put(): insert the  key and value as a pair in the map
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(3,"Jack");
        map.put(40,"Emma");
        map.put(5,"Izabela");
        System.out.println(map);


        // size() : returns the size (total numbers of the pair) Of the map
        System.out.println(map.size());

        //get(key) returns the value of the given key of the map
        System.out.println(map.get(20));// George

        //replace(key, new value) replace the value of the given key
        map.replace(20, "Alli");
        System.out.println(map);

        // remove(key): removes the given key and its value from the map

        map.remove(20);
        System.out.println(map);
        System.out.println(map.size());

        // contains(key)check if the given key is contained in the map, returns boolean
        System.out.println(map.containsKey(10)); // true
        System.out.println(map.containsKey(20));//false

        // containsValue(value) // check if the given value is contained in the map, returns boolean
        System.out.println(map.containsValue("Lea"));
        System.out.println(map.containsValue("Arthur"));

        // isEmpty(): checks if the map is empty, returns boolean
        System.out.println(map.isEmpty());

        System.out.println( map);

        // equals(MapObject) checks if the map is equal to the given map in the argument, returns bolean
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10,"Arthur");
      //  linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Izabela");

        System.out.println(map.equals(linkedHashMap));

        System.out.println(map==linkedHashMap);
        // clear() removes all the keys and values from the map, size will be set to 0
        map.clear();
        System.out.println(map);




    }
}
