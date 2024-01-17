package reviewLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {//1472 leetcode
    //declare two stacks and current
    // we need 2 stacks but instead stack I will use Deque

    Deque<String> history, forwardStack; // 2 stacks
    String currentPage;


    public BrowserHistory(String homepage){
        // initialize stacks and current = homepage
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homepage;
    }
    public void visit(String url){ // make the visit
      // push "current" in "history" stack and mark "url" as "current".
        history.push(currentPage); // pushed current page to the history
        currentPage = url; // current page is equal to url
        System.out.println(url + " is visited");
        forwardStack = new ArrayDeque<>(); // cleared old stack and created new stack

    }
    public String  back(int steps){//
        int  steps2 = steps;
        // Pop elements from "history" stack, and push elements in "forward" stack.
        while(steps>0 && !history.isEmpty()) {
            forwardStack.push(currentPage);// i push to forwardStack the current page
            currentPage = history.pop(); // history is popped and assigned to current page
            steps--; // number of steps are repeating/ decreased
        }
        System.out.println("Back operation of " + steps2 + " brings " + currentPage);
        return currentPage;// returning current page
    }
    public String forward(int steps){//because of int steps we need the loop
        int steps2 = steps;
        // Pop 'elements' from "forward' stack, and push elements in 'history' stack.
        while(steps>0 && !forwardStack.isEmpty()) { // needs to be repeated number of steps
            history.push(currentPage); // i pushed current page into the history
            currentPage = forwardStack.pop(); // forwardStack is popped and assigned to current page
            steps--; // number of steps are repeating/decreasing
        }
        System.out.println("Forward operation of " + steps2 + " brings " + currentPage);
        return currentPage; // returning to the current page
    }
}

