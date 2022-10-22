package com.cydeo.day2_arrays;

import java.util.ArrayList;

public class Assigment2_NumberPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> busStop = new ArrayList<int []>();
        busStop.add(new int [] {10,0});//first stop
        busStop.add(new int [] {3,5});
        busStop.add(new int [] {2,5});//last stop
        System.out.println(countPassengers(busStop));
    }
    public static int countPassengers(ArrayList<int[]>stops){
        //runs in o(n) complexity because there is a single loop with size n
        int numOfPeople=0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople=numOfPeople + stops.get(i)[0]- stops.get(i)[1];

        }
        return numOfPeople;

    }
}
