import java.util.ArrayList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList1=new MySinglyLinkedList();
        System.out.println(myList1.isEmpty());
        MySinglyList2 myList = new MySinglyList2();
        for (int i = 0; i <10 ; i++) {
            myList.add(i);
        }
        myList.printNodes1();
        myList.deleteById(9);
        myList.printNodes1();
        System.out.println("index of 0 : " + myList.indexOf(0));

        MySinglyLinkedList myList2=new MySinglyLinkedList();
        myList1.add(1);myList1.add(3);  myList1.add(6);myList1.add(7);
        myList2.add(2);myList2.add(4);  myList2.add(5);




     /*
       Node newHead = MergeLinkedLists.mergeLinkedLists(mylist1.head,mylist2.head);

      while (newHead!=null){
          System.out.println(newHead.id);
          newHead=newHead.next;
      }

      */



    }


}
