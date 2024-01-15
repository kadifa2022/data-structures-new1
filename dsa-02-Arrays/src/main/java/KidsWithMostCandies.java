import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithMostCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3).toString());

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        //create return type
        List<Boolean> result = new ArrayList<>();
        // find max candies
//        int max = -1;
//        for(int i = 0; i< candies.length; i++){
//            if(candies[i] > max) max = candies[i];
//        }
        //for loop iteration to check extraCandies
        int max = Arrays.stream(candies).max().getAsInt();// find max candies
        for(int candy: candies){  // for loop iteration to check with extra candies
            result.add(candy + extraCandies >= max);
        }
//        for(int i = 0; i < candies.length; i++){
//            if(candies[i] + extraCandies >= max){
//                result.add(true);
//            } else result.add(false);
//        }

        // return result
        return result;

    }


}
