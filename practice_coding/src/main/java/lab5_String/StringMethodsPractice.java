package lab5_String;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String name = "Josh Daniel";

        // store in container
        char ch = name.charAt(4);
        System.out.println(name.charAt(4));
        System.out.println(name.length());

        char lastChar = name.charAt(name.length() -1);
        System.out.println(lastChar);

        System.out.println("----------indexOfMethod------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');
        System.out.println(index1);

        int index2 = school.indexOf('j');
        System.out.println(index2);

        String str1 = "Java Programing Language"; // find second 'a'
        int index3 = str1.indexOf("va") + 1; // or add space because is unique
        System.out.println(index3);

        System.out.println(" -----String is immutable --- ");

        String s1 = "WOODEN SPOON";// eligible for GC

         s1 = s1.toLowerCase(); // creating new string "wooden spoon"
         System.out.println(s1); // GB after initial

         s1 = s1.toUpperCase();
          System.out.println(s1);

        System.out.println("-------Replace() --------------");

        String sentence = "Today is Thursday, and Thursday is a lab day"; //GC

        sentence = sentence.replace("Thursday", "Friday");
        System.out.println(sentence);





    }
}
