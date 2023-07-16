package com.cydeo.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history , forwardStack;
    String currentPage;
    public BrowserHistory(String homepage){
        // initialize stack and set current url to home page
        history= new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage= homepage;
    }
    public void visit(String url){
        history.push(currentPage);
        System.out.println(url+ "is visited");
        currentPage = url;
        forwardStack = new ArrayDeque<>();
    }
    public String back(int steps){
        int stepNumber = steps;
        while (steps>0 && !history.isEmpty()){
            forwardStack.push(currentPage);
            currentPage=history.pop();
            steps --;

        }
        System.out.println("Back operation of: " + stepNumber+ "brings " + currentPage + "as current page");
        return currentPage;

    }
    public String forward(int steps){
        int stepNumber = steps;
        while (steps>0 && !forwardStack.isEmpty()){
            history.push(currentPage);
            currentPage=forwardStack.pop();
            steps --;

        }
        System.out.println("Forward operation of: " + stepNumber+ "brings " + currentPage + "as current page");
        return currentPage;
    }

}
