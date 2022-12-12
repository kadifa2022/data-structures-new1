package com.cydeo.algoQuestions;

public class BestTimeToByAndSellStock {

    public static int bestTimeToBuyStock(int[] days) {
        int minValueToBuy = Integer.MIN_VALUE;
        int profit = 0;
        int price = 0;

        for (int i = 0; i < days.length; i++) {
            if(days[i] < minValueToBuy){
                minValueToBuy=days[i];
            }
            price = days[i] - minValueToBuy;
            if(profit < price){
                profit = price;
            }

        }
        return profit;


    }

}
