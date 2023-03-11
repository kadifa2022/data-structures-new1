import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 9, 11};
        System.out.println(Arrays.toString(twoSumSolution(array, 20)));
        System.out.println(Arrays.toString(twoSumSolution2(array, 11)));


    }

    public static int[] twoSumSolution(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) return new int[]{i, j};

                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumSolution2(int[] array, int targetValue){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j<array.length; j++){
                if(i !=j){
                    if(array[i] + array[j]==targetValue)return  new int[]{i,j};
                }
            }

        }

            return  new int[]{};
    }

    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> num_map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            int complement = target-nums[i];
            if(num_map.containsKey(complement)){
                return new int[]{num_map.get(complement), i};
            }
            num_map.put(nums[i], i);
        }
        throw  new IllegalArgumentException("No match found!");

    }

}
