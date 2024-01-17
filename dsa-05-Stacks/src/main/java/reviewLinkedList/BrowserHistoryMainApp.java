package reviewLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BrowserHistoryMainApp {
    public static void main(String[] args) {
        //Deque is interface
        Deque<String> stack = new ArrayDeque<>();
        // if we want to use stack we need to use ArrayDeque it is faster impl of stack class than collections,
        //stack is extending vector class and is synchronized -> performance slower

        /*
        BrowserHistory bh = new BrowserHistory("leetcode.com")

        bh.visit("google");
        bh.visit("facebook");
        bh.visit("youtube");
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Forward 1 step: "+ bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println("Forward 2 step: "+ bh.forward(2));
        System.out.println("Back 2 step: "+ bh.back(2));
        System.out.println("Back 7 step: "+ bh.back(7));

         */


    }
}
