import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.toList;

public class LetterCandles {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        // Read inputs here!
        System.out.println("Enter letter count:");
        int letterCount = Integer.parseInt(reader.readLine());

        System.out.println("Enter the numbers of candles that can be removed: ");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("Enter candle letters: ");
        String letters = reader.readLine();

        System.out.println(letterCandlesCost(letterCount,m,letters));


    }

    public static  int letterCandlesCost(int letterCount, int m, String str){
        int cost =0;
        //1. we will find letter frequency
        //2. minimize cost //
        //3. sort from

        // create hashMap //O(n<26)
        Map<Character,Integer > map = new HashMap<>();
        int count;
        //O(n)
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch,count +1);
            }else map.put(ch,1);
        }
        //nlogn is not grater than 26 // constant value
        List<Integer> letterFreq = map.values().stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(toList());

        // minimize cost
         int index = 0;
         //O(n) n is not grater than 26 in fact it is constant number
         while(m > 0 && index < letterFreq.size()-1){
             if(letterFreq.get(index)>= letterFreq.get(index + 1)){
                 letterFreq.set(index, letterFreq.get(index)-1);
                 m--;
             }else if(index> 0 && letterFreq.get(index) <letterFreq.get(index - 1)) index --;
             else index ++;
         }
         // calculate min cost
        //O(n) n is not grater than 26
        for(Integer num : letterFreq){
            cost+= num * num;
        }
        //return result // over all is O(n)
        return cost;
    }

}
