package CollectionsUtilityClass;

import java.sql.SQLOutput;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();// random order // no null values
        priorityQueue.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println("Priority queue = " + priorityQueue);

        Queue<Integer> arrayDequeue = new ArrayDeque<>(); // insertion order // accepts null values
        arrayDequeue.addAll(Arrays.asList(10,200,300,40,50,60));
        System.out.println("Array dequeue = "+ arrayDequeue);

        Queue<Integer> linkedList = new LinkedList<>();// insertion order
        linkedList.addAll(Arrays.asList(10,200,300,40,50,60));
        System.out.println("Linked list = " + linkedList);

        System.out.println("---------------------");

        priorityQueue.poll(); // calling poll() first element will be removed
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("Priority queue = " + priorityQueue);
        System.out.println("Array dequeue = "+ arrayDequeue);
        System.out.println("Linked list = " + linkedList);

        System.out.println("---------------------");

        priorityQueue.poll(); // calling poll() first element will be removed
        arrayDequeue.poll();
        linkedList.poll();

        System.out.println("Priority queue = " + priorityQueue);
        System.out.println("Array dequeue = "+ arrayDequeue);
        System.out.println("Linked list = " + linkedList);


        System.out.println("linkedList calling from Queue Interface needs to casted down");
        System.out.println(((LinkedList<Integer>) linkedList).get(2));

        System.out.println("Iterating priorityQueue and ArrayDeque we use forEach");

        for (Integer each : priorityQueue) {
            System.out.println(each);

        }
        System.out.println("ArrayDequeue------------");

        for (Integer each : arrayDequeue) {
            System.out.println(each);

        }



    }
}
