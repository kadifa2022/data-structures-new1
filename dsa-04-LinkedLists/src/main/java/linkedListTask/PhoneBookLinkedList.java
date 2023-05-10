package linkedListTask;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBookLinkedList {

    public PhoneNode head;
    public PhoneNode tail;
    public int size;


    public boolean isEmpty() {
        return head == null;
    }
        public int size(){
            return size;
        }

        public void  printPhoneBook(){
        PhoneNode current = head;
        while(current != null){
            System.out.println(current.contact);
            current= current.next;
        }
        }
        public void add(Contact contact) {
            PhoneNode nodeToBeInserted = new PhoneNode(contact);

            if(isEmpty()) {
                head = tail = nodeToBeInserted;
            }else{
                tail.next = nodeToBeInserted;
                tail = nodeToBeInserted;
            }
            size++;
        }

        public PhoneNode findBByFirstName(String firstName){
        if(isEmpty()){
            throw new NoSuchElementException("its n ot here guys");
        }
        PhoneNode current = head;
        while(current != null){
            if (current.contact.getFirstName().equals(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw  new NoSuchElementException("does not exist");

        }

        public List<PhoneNode> findAllByLastName(String lastName){
        if(isEmpty()){
            throw new NoSuchElementException("It is empty");
        }
        List<PhoneNode> listLastName = new ArrayList<>();
        PhoneNode current1 = head;
        while(current1 != null){
            if (current1.contact.getLastName().equals(lastName)) {

                listLastName.add(current1);
            }
            current1 =current1.next;
            }
        return listLastName;
        }



    }

