package heap;

import java.util.Arrays;

public class getKthLargestElement {
    public static void main(String[] args) {
        int[] num = {3,2,1,5,6,4};
        System.out.println(getKthLargest(num,5));

    }
    public static int getKthLargest(int[] array, int k){
        // create a heap
        MyHeap heap = new MyHeap(array.length);
        for(int i=0; i<array.length; i++){
            heap.insert(array[i]);
        }
        for(int i=0; i < k-1; i++){
            heap.remove();
        }
        return heap.peek();

    }

}
