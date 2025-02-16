package CollectionsUtilityClass;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,6));


        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,3,4,5));

        System.out.println("arrayList " + arrayList);
        System.out.println("linkedList " + linkedList);
        System.out.println("Vector " + vector);
        System.out.println("Stack " + stack );
    }
}
