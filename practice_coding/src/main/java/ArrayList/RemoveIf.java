package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9));
        /*

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) < 5){
                list.remove(i); //remove() - is not able to remove element based on index # because of the collections,
                                 //collections is dynamic DS  and will shift element
            }
        }
        System.out.println();

         */

        //removeIf(Predicate): removes all the elements from the ArrayList that are matching wit the given predicate condition

                        //variable name(each) and add conditions
            list.removeIf(each -> each <= 4);
            System.out.println(list);

        System.out.println("-------------------");
        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Java", "Python", "C#", "Java","JUnit"));
        //p (variable) is representing each object in the list
        names.removeIf(p -> p.startsWith("J"));
        System.out.println(names);








        }
    }

