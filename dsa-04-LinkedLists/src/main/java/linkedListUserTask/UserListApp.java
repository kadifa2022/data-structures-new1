package linkedListUserTask;

public class UserListApp {

    public static void main(String[] args) {
        UserLinkedList list = new UserLinkedList();
        list.insertLast( new UserNode("Carol", "Smith"));
        list.insertLast( new UserNode("Mike", "Smith"));
        list.insertLast( new UserNode("Diana", "Smith"));
        list.printNames(); // print method


    }
}
