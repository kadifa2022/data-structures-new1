package com.cydeo.stack;

public class BrowserHistoryApp {

    public static void main(String[] args) {


        BrowserHistory bh = new BrowserHistory("leetcode.com");
        bh.visit("google");
        bh.visit("facebook");
        bh.visit("youtube");
        System.out.println("Back one step" + bh.back(1));
        System.out.println("Back one step" + bh.back(1));
        System.out.println("Forward one step" + bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println("Forward two step" + bh.forward(2));
        System.out.println("Back 2 step" + bh.back(2));
        System.out.println("Back 7 step" + bh.back(7));
    }
}
