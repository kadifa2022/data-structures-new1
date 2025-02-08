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

        System.out.println("-------replace() --------------");

        String sentence = "Today is Thursday, and Thursday is a lab day"; //GC

        sentence = sentence.replace("Thursday", "Friday");
        System.out.println(sentence);

        System.out.println("-------replaceFirst() --------------");

        String s = "Today is Thursday, and tomorrow is Thursday ";
        s = s.replaceFirst("Thursday", "Wednesday");
        System.out.println(s);

        System.out.println("-------substring()----------");
        // ask to replace domain of the email

        String email = "cydeo_school@gmail.com";
        int beginningIndex = email.indexOf('@') + 1;//  middle of the string to ger specific substring
         int endIndex = email.lastIndexOf('.'); // ending index is always excluded in substring method
        String domain = email.substring(beginningIndex, endIndex);
        System.out.println(domain);

        System.out.println("substring to the end ------");
        String s2 = "I study at CYDEO";

        String schoolName = s2.substring(s2.indexOf('C'));// from the specific character to the end of the string
        System.out.println(schoolName);

        System.out.println("-----------------------------------");
        String a1 = "Dog";
        String a2 = "dog";
        System.out.println(a1.equals(a2));//print statement any accepts value











    }
}
