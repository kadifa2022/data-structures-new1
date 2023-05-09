package linkedListTask;

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


    }

