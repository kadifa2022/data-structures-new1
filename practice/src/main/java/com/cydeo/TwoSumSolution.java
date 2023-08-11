package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;


class TwoSumSolution {
    public static void main(String[] args) {

        int nums [] = {2,7,20,24,12,2,2,3,44,4};

        System.out.println(Arrays.toString(twoSum(nums,44)));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])){
                return new int []{i, map.get(target - nums[i]) };

            }else{
                map.put(nums[i], i);

            }

        }
        return  new int[] {};






    }
}
/*
to solve this problem we will use the HASHMAP. in Hashmap we will insert the nums element as a key and their index value as a key value to this map.
For example. the given array is nums[2,7,11,15] and traget = 9.
so, we will create a map like, Map[2=0,7=1,11=2,15=3].
we will use a for to traverse through the whole array and insert them into the map.

Algorithm.

1.Initialize a HashMap <Integer, Integer>.
2.we will use a for loop to traverse through the nums array.
3.in for loop, add a if condition where we will check if the map contains the Key that is equal to target - nums[i].
Like, target is 9 and nums[i] = 2.so we are simply checking here if map contains a key that is 9-2= 7 ( target - nums[i] ).
 we are checking here if our map containing the key 7.
 if yes we will return the answer as in array using the values of these keys.
4.we will add the nums[i] as a key and i as a value that is associated to this key. and continue from step 2.

Time complexity:
For this solution time complexity will be O(n). where N is the number of elements in nums.

the loop integrated through the nums array once and for each operation it performs the constant operation (Map lookups and Insertions). There for the time complexity for this part will be O(n)
Space complexity:
Space complexity will also be O(n). as we are using an extra data structure to store our all the data of nums.
 */