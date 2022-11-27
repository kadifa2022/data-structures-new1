package com.cydeo.day04_linkedLists.cycleDetectionProblem;

import java.util.HashSet;

public class LinkedListCycleWithHashSet {
    public static void main(String[] args) {

    }

    static ListNode withHashSet(ListNode head) {

        if (head == null) return null;
        ListNode current = head;

        HashSet<ListNode> set= new HashSet<>();
        while(current != null){
            if(!set.add(current)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

}