package com.cydeo.day04_linkedLists;

public class IntersectionOfTwoLinkedLists{
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode first=headA;
        ListNode second= headB;

        while (first != second){
            if(first ==null){
                first=headB;
            }else{
                first=first.next;
            }
            if (second==null){
                second=headA;
            }else{
                second=second.next;
            }
        }
        return  first;
    }



}
