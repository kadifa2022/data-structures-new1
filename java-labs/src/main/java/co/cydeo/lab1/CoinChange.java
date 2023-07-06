package co.cydeo.lab1;

public class CoinChange {

    public static void main(String[] args) {

        int priceInCents = 75;
        int change = 100 - priceInCents;//35 c-> .25 ->.10

        int quarter = change / 25; // 40 ->1 quarter
        int dimes = (change%25)/10;//reminder  15-> 1 dime
        int nickles = ((change%25)%10)/5;
       // System.out.println((double)40/25);// double / int  = double

        System.out.println("quarter " + quarter + " dimes " +dimes + " nickles "+ nickles);


    }
}
