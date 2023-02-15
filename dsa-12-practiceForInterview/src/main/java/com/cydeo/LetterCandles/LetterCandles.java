package com.cydeo.LetterCandles;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LetterCandles {

    public static void main(String[] args) {
        System.out.println(letterCandlesCost(6,3,"bacbcc" ));
    }

    public static int letterCandlesCost(int letterCount, int m, String str) {
        //Create a map :this will cost me space complexity O(n)

        Map<Character, Integer> map = new TreeMap<>();

        int count;
        int cost = 0;
        //count the frequency of chars
        for (Character ch : str.toCharArray()){
            if (map.containsKey(ch)){
            count = map.get(ch);
            map.put(ch, count + 1);
        }else map.put(ch, 1);
    }
        int index =0;
        List<Integer> letterFreq= map.values()
                .stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        //cost is reduced here

        while (m>0 && index<letterFreq.size()-1){
            if(letterFreq.get(index)>=letterFreq.get(index+1)){
                letterFreq.set(index,letterFreq.get(index)-1);
                m--;
            }else index ++;
        } // O(m=26 at most) O(1)
        for (Integer num : letterFreq) {
            cost+=num*num;
        } // O(m<=26)
        return  cost;
}

}
