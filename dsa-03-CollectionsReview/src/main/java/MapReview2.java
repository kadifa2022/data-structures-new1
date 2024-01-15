import java.util.*;
import java.util.stream.Collectors;

public class MapReview2 {
    public static void main(String[] args) {


        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        studentsMap.put(3, "Alison");
        studentsMap.put(4, "Mehmed");

        //How to get VALUES from a map
        List<String> list = studentsMap.values().stream().collect(Collectors.toList());
        System.out.println(list);
        //How to get KeySet with list from a map
        List<Integer> list2 = studentsMap.keySet().stream().collect(Collectors.toList());
        System.out.println(list2);




        //how to get value and sort them
        List<String> list3 = studentsMap.values().stream().sorted((o1, o2) -> o1.compareToIgnoreCase(o2))
                .collect(Collectors.toList());

        // how to get entry set

        Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();
        System.out.println(entries);

        System.out.println(studentsMap.entrySet().size());

        // how to get key set

        Set<Integer> keySet = studentsMap.keySet();
        System.out.println(keySet);

        for (Integer integer:studentsMap.keySet()) { // another way to get the keySet
            System.out.println(integer);
        }


    }
}
