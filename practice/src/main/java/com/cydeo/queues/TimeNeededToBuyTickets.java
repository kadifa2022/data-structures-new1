package com.cydeo.queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {


        int[] array = {2, 3, 2};
        int k=2;
        System.out.println(buyTickets(array, k));

    }

    public static int buyTickets(int[] array, int k) {

       var myDequeue= Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayDeque::new));

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (array[k] != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    continue;
                }
                if (array[k] == 0) {
                    break;
                }
                arrayList.add(array[i]--);

            }

        }
        return arrayList.size();

    }

}
