package com.cydeo.session_3_LinkedListPractice;

public class PhoneBookApp {

    public static void main(String[] args) {




        Node entry = new Node("Kadifa", "Cannom", "Kadifa@gmail.com", "519-888-8875");
        Node entry12 = new Node("Cry1", "Smith", "LorraineCannom@gmail.com", "519-888-8875");
        Node entry2 = new Node("B", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry3 = new Node("Leyla", "Jones", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry4 = new Node("Sema", "jack", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry5 = new Node("Mark", "Jill", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry6 = new Node("Sara", "Pete", "RamazanCetintas@gmail.com", "519-888-8875");

        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add(entry);

        phoneBook.add(entry2);
        phoneBook.add(entry3);
        phoneBook.add(entry4);
        phoneBook.add(entry5);
        phoneBook.add(entry6);

        System.out.println(phoneBook.indexOf("RamazanCetintas@gmail.com"));
        System.out.println(phoneBook.findByName("Ramazan"));
        phoneBook.deleteByEmail("Kadifa@gmail.com");
        phoneBook.print();
        phoneBook.sortByName();
        phoneBook.print();



        phoneBook.print();
    }


}
