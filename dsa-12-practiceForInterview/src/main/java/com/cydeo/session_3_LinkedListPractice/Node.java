package com.cydeo.session_3_LinkedListPractice;

import lombok.Data;

@Data
public class Node {
   public String firstName;
  public  String lastName;
   public String email;
   public String phoneNumber;
   Node next;

    public Node(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


}
