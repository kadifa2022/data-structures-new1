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


        System.out.println("--------------------------IndexOf ------------------------");
        // IndexOf('e')("java")pass char or string
        String school = "Cydeo School";
        int  index1 = school.indexOf('e');
        System.out.println(index1);

        int index2 = school.indexOf('j');// negative n  means nno exist
        System.out.println(index2);

        String str1 = "Java  Programming Language";
        int index3 = str1.indexOf("va");//'v' can be char' '
        System.out.println(index3);

        System.out.println("-----------------toLowerCase and toUpperCase ----------------------------");
        String s1 = "WOODEN SPOON";// gcollector
        s1 = s1.toLowerCase();// new "wooden spoon"  but we have to reassign// GC
        System.out.println(s1);
        // after re-initials is new object and old one is available for GC
        s1 = s1.toUpperCase(); // "WOODEN SPOON"  after we
        System.out.println(s1);

        System.out.println("--------------replace -------------");

        String sentence = "Today is Thursday, and Thursday is lab day";// alienable for GC

        sentence = sentence.replace("Thursday", "Friday");


        System.out.println(sentence);

        System.out.println("--------------replaceFirst--------------");

        String s = "Today is Thursday, and tomorrow is Thursday";
        s = s.replaceFirst("Thursday", "Wednesday");
        System.out.println(s);

        System.out.println("--------------substring Methode--------------");


        String email = "cydeo_school@gmail.com"; // to create substring value
        int beginningIndex = email.indexOf('@') + 1;// checks from left to right
        int endingIndex = email.indexOf('.');// checks from right to left
       String domain =  email.substring(beginningIndex, endingIndex);
        System.out.println(domain);


        System.out.println("-----------------------------------");
/*
        String s2 = " I study at CYDEO";
        int begIndex = s2.indexOf("at") + 2;
        int endIndex = s2.length();
        String sub = s2.substring(begIndex, endIndex);
        System.out.println(sub);

 */

        String s3 = "I study at CYDEO school";
        String schoolName = s3.substring(s3.indexOf('C'));// upper latter uniq
        System.out.println(schoolName);









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