package com.cydeo.Practice.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter 5 Numbers:" );
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();//  we want to read input from the use

            if(!arrayList.contains(temp))
                arrayList.add(temp);

        }
        Collections.sort(arrayList);
        System.out.println(arrayList);


        

        


    }
}
