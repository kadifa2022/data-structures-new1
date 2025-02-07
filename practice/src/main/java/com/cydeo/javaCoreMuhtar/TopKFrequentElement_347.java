package com.cydeo.javaCoreMuhtar;

import java.util.*;

public class TopKFrequentElement_347 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequentElement(new int [] {1,1,1,2,3,3,2}, 2)));

    }
    public static int [] topKFrequentElement(int [] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,1) + 1);

        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) -map.get(a));
        int [] res = new int[k];
        int index = 0;
        for (int i = 0; i<k;i++){
            res[index]=list.get(i);
            index ++;
        }
        return res;
    }

}
