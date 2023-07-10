package co.cydeo.lab5_String_Loop_ifStatement;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String name2 = "Cydeo";
        String name = "Josh Daniel";
        //index number 012345678910

       char ch =  name.charAt(4);// char object contains string object 5th character

        System.out.println(ch);
        System.out.println(name.length());// total number of elements

        char lastChar = name.charAt(name.length()-1); // find last character .length()-1
        System.out.println(lastChar);


        System.out.println(" -------------indexOf()----------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');

        System.out.println(index1);

        int index2 = school.indexOf('j');
        System.out.println(index2);// return -1 because don't exist

        String str1 = "Java Programing language";

        //int index3 = str1.indexOf("va") +1;
        int index3 = str1.indexOf("a ");
        System.out.println(index3);

        System.out.println("------------Upper and lower case methode-----------");

        String s1 = "WOODEN SPOON";// after re-assigning to new string this is eligible for Garbage collector
        // to use toLowerCase() we have to re-assign  string
        s1 = s1.toLowerCase();//wooden spoon
        System.out.println(s1);
        // after we re-assign back toUpperCase, the toLowerCase is referencing to GC
        s1= s1.toUpperCase(); //WOODEN SPOON
        System.out.println(s1);

        System.out.println(" ---------------------Replace----------------------");

        String sentence = "Today is Thursday, and Thursday is a Lab day";//GC

      sentence =  sentence.replace("Thursday", "Friday");// NEW SENTENCE
        System.out.println(sentence);





































    }
}