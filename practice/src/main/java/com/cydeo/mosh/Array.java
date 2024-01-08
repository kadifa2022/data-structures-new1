package com.cydeo.mosh;

public class Array {  // Array class

    private int [] items;
    private int count;

    public Array(int length){
        items = new int [length];
    }
    public void insert(int item){
        //if the array is full, resize it (we are writing an expression)
        if(items.length == count) {// writing expression if array is full then we need to crate new Array

            // Create a new array (twice the size) then
            int [] newItems = new  int[count * 2]; // this new array is size of 2

            // Copy all existing items to new array // here we gona use forLoop
            for(int i =0; i< count; i++){// set it count from 0 : if i is less than count : increment count by 1
                newItems[i] = items[i]; // copied all items to newItems array
            }
            //Set "items" to new array
            items = newItems;


        }
        //add the new item at the end
        // we simplify this code count++
        items[count++] = item ;// this index will represent last item in array (new item)
       //  count++;  // increment count by 1

    }

    public void removeAt(int index){ // delete method
        // 1. validate the index for exp: is pass -1 or to pass index which don't exist
        if(index < 0 || index >= count) // if count is 4 that means index is 3 (we can't tell remove index 4which don't exist
        throw new IllegalArgumentException();
        //2. shift the index to the left to fill the hole
        //[10,20,30,40] let say remove index:1  // we ere shifting each item one step to the left
        //1<-2,2<-3,3<-4  after we execute loop all items will be shifted to left
        for(int i = index; i <count; i++)
            items[i] = items[i +1];
        count--; // decrementing count array will be decreased automatically by 1


    }


    public void print(){
        for(int i = 0; i < count; i++)// items.length replaced with count
            System.out.println(items [i]);
    }

}
