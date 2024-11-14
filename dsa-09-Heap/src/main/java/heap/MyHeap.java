package heap;

import java.util.NoSuchElementException;

import static java.util.Collections.swap;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size =0;
    }
    public int peek(){
        if(size==0) throw  new NoSuchElementException();
        return items[0]; // return index 0 root
    }
    public void insert( int value){
        if(size == items.length) throw new IllegalStateException();
        else {
            items[size ++] = value;
            bubbleUp();

        }
    }

    public void bubbleUp() {
        //calculate start point /index
        int index= size -1;
        //while index > && parent is less than child continue
        while(index > 0 && items[index]>items[parentIndex(index)]){
            //1. swap child parent
            swap(index, parentIndex(index));
            // assign index with the parent index
            index = parentIndex(index); //is like current is = to current.next

        }


    }

    private void swap(int index, int parentIndex) {// can be int first, int second
        int temp= items[index];
        items[index] = items[parentIndex];
        items[parentIndex]= temp;
    }
    // calculate next index = parent index
    private int parentIndex(int index) { return (index-1)/2;}
    public void printHeap(){
        for(int i =0; i<size; i++){
            System.out.print(items[i] + ", ");
        }
        System.out.println();
    }

}
