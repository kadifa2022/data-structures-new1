import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MergeSameItems {
    public static void main(String[] args) {
        //[[1, 6], [3, 9], [4, 5]]

        int [][] items1 = {{1,1},{4,5},{3,8}};
        int [][] items2 = {{3,1},{1,5}};
        List<List<Integer>> a = mergeSimilarItems(items1,items2);
        System.out.println(a);
       // System.out.println(mergeSimilarItems(items1, items2));
    }

    public static  List<List<Integer>> mergeSimilarItems(int[][] items1, int [][] items2){
        List<List<Integer>> result = new ArrayList<>();//1. we created return type
        //2.create tree map, because we need keys in ascending order
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // 3. add items1 into tree map
        for(int [] item: items1){
            map.put(item[0], item[1]);
        }
        // 4.add items2 into treemap, if no entry than add item first then update
        for(int [] item : items2){
            map.putIfAbsent(item[0],0); // if is no item
            map.put(item[0],map.get(item[0]) + item[1]);// once you find it -> add
        }
        //5. go over the treemap and jey and value (weight) into a list and add list into result lis
        for(var item:map.keySet()){ // get keys and iterate and put key + weight into list of list
            List<Integer> row = new ArrayList<>();
            row.add(item);
            row.add(map.get(item));
            result.add(row);
        }

        return result; // return list
    }
}
