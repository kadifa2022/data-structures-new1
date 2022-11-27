package com.cydeo.day04_linkedLists.cycleDetectionProblem;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode listNode= new ListNode(3);
                listNode.next=new ListNode(2);
                listNode.next.next=new ListNode(0);
                listNode.next.next.next=new ListNode(4);
                listNode.next.next.next.next=listNode.next;
        System.out.println(detectCycleWithTwoPointer(listNode.next.next));



    }

//    static ListNode detectCycle(ListNode head){
//
//    }

    static ListNode detectCycleWithTwoPointer(ListNode head){
        if(head ==null || head.next == null) return null;
        ListNode slow=head, fast =head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                ListNode firstNode=head;
                ListNode intersection=fast;
                while(firstNode!=intersection){
                    intersection=intersection.next;
                    firstNode=firstNode.next;
                }
                return firstNode;
            }
        }
        return null;
    }



}
