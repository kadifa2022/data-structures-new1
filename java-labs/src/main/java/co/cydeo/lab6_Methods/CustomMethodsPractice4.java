package co.cydeo.lab6_Methods;

public class CustomMethodsPractice4 {

    public static void main(String[] args) {
        String str = "aaabccdeeeef";// find unique
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            /*
            char each = str.charAt(i);
           int f =  StringUtility.frequency(str, each);

           if(f==1){
               unique +=each;
           }

        }

             */
            if (StringUtility.frequency(str, str.charAt(i)) == 1) {//solution 2
                unique += str.charAt(i);
            }
        }

        System.out.println(unique);//bdf



        System.out.println("-----------------------------");

        String s = "aaaabbc";// "a4b2c1   // find the frequency of every single element
        String nonDup = StringUtility.removeDup(s);// abc

        String result="";

        for (int i = 0; i < nonDup.length() ; i++) {
            /*
            char ch = nonDup.charAt(i);            //abc
            int f = StringUtility.frequency(s, ch);//421
            result += ""+ ch + f;
            */

            result += ""+nonDup.charAt(i) + StringUtility.frequency(s, nonDup.charAt(i));

        }
        System.out.println(result);

    }

}
