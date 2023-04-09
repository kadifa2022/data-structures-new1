package com.cydeo.algoQuestions.leetCodeInteviewQuestions;

public class ReversedLikedList {

    public ListNode reversedLikedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next= prev;
            prev= curr;
            curr = nextTemp;

        }
        return prev;
    }
}
