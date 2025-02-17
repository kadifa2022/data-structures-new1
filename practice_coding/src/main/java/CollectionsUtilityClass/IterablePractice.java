package CollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));
/*
        for (int i = 0; i < list.size(); i++) { // not good way to remove elements
            if(list.get(i) < 4){
                list.remove(i);

            }

        }

 */
        Iterator<Integer> it =list.iterator(); // best loop to use with iterator is while loop
       while (it.hasNext()) {
         Integer element = it.next();
         if(element<4){
             it.remove();
         }
       }

        System.out.println(list);
        System.out.println("Short cut for iterable with removeIf method----------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));
        list2.removeIf(p-> p <= 4); // internally use Iterable and creates the loop
        System.out.println(list2);

        }

    }


