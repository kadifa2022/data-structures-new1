package com.cydeo.dsa01AlgorithmAnalysis;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {

        ArrayList<int[]> busStop = new ArrayList<int[]>();

        busStop.add(new int[] {10,0});// first stop nobody gets off the bus
        busStop.add(new int[] {3,5});// second stop 3 in , 5 out
        busStop.add(new int[] {2,5});// third stop 2 in , 5 out
        System.out.println(countPassengers(busStop));

    }

 public static int countPassengers(ArrayList<int[]> stops){

        //runs in o(n) complexity because there is a single loop with size n
        int numOfPeople =0;//Variable initials 0
     for (int i = 0; i < stops.size(); i++) {
         numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];

     }
     return  numOfPeople;
 }

}
