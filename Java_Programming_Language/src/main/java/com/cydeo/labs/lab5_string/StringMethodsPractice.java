package com.cydeo.labs.lab5_string;

public class StringMethodsPractice {

    public static void main(String[] args) {
        //             0123456789
        String name = "Josh Daniel";

        //storing in container  by assigning back and for reusing
        char ch = name.charAt(4);// 5 character
        System.out.println(ch);

        //char lastChar = name.charAt()
        System.out.println(name.length());//
        char lastChar = name.charAt( name.length()-1);
        System.out.println(lastChar);






    }
}
/*
for loop :
if the iteration is known
 start point  / int i = 1;   stop  i < 6; i ++
for (initialization; condition; iterator ) //to start and stop{} body of the loop

While loop:
if the iteration is unknown
 */