import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListReview2 {

    public static void main(String[] args) {

        //Convert an Array to ArrayList with Arrays.asList()
        Integer [] arr= {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        ArrayList<Integer> newList= new ArrayList<>(Arrays.asList(arr));

        //Convert an Array to ArrayList with Collections.addAll()


        //convert an ArrayList to Array
        //convert an ArrayList to Array using streams
        //Sort without comparator
        //Binary search on collections
    }
}
