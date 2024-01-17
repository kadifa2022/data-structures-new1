package ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static void main(String[] args) {

        int[] myArray = new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(largestRange(myArray)));
    }

    public static int[] largestRange(int[] array) {
        int[] bestRange = new int[2]; // will have only 2 elements first and last
        int longestRange = 0;
        // boolean if is visited or not
        Map<Integer, Boolean> numsMap = new HashMap<>();
        for (int i : array) {  // true means not visited yet
            numsMap.put(i, true);
        }
        for (int i : array) {
            if (!numsMap.get(i)) continue;
            //this part means that this part is not visited yet
            int currentLength = 1;
            int left = i - 1; // two pointers
            int right = i + 1;
            // find left edge of this current value
            while (numsMap.containsKey(left)) {
                numsMap.put(left, false);
                currentLength++;
                left--;
            }
            // find right edge of this current value
            while (numsMap.containsKey(right)) {
                numsMap.put(right, false);
                currentLength++;
                right++;
            }

            if (currentLength > longestRange) {
                longestRange = currentLength;
                bestRange = new int[]{left + 1, right - 1};
            }
        }
        return bestRange;
    }
}