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


        System.out.println("----------------substring and indexOf-------------------");
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

        System.out.println("-------------Equals() return boolean value-----------");
        String a1 = "DOG";
        String a2 = "dog";// equals() comparing two

        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));// comparing string literal


        System.out.println("----------------contains()----------------------" );

            // if something is included in sentence than we should use  contains() return boolean
        String str = "Java is my favorite programming language";

        System.out.println(str.equals("Java"));// for comparing
        System.out.println(str.contains("Java"));// if is included

        System.out.println("--------trim() repeat() isBlank------------------------------");

        str.trim();// spaces on beginning and end will be removed
        str.repeat(2);//how many times  same string will be repeated
        System.out.println(str.repeat(2));

        System.out.println("------------StartsWith()endsWith()------------------------");

        String w = "Cydeo School";
        System.out.println(w.startsWith("Cydeo"));
        System.out.println(w.endsWith("ool"));











    }
}
/*
for loop :
if the iteration is known
 start point  / int i = 1;   stop  i < 6; i ++
for (initialization; condition; iterator ) //to start and stop{} body of the loop

While loop:
if the iteration is unknown


        String is sequences of characters
        String Methods;
        substring()
        charAt()
        length()
        indexOf(),(lastIndexOf),
        lower/upper().
        replace, (replaceFirst)
        equals(),// return boolean
        contains()// return boolean
        startWith/endWith()

 */