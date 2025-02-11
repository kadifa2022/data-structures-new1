package lab6_CustomMethods;

public class CustomMethodsPractice4 {

    public static void main(String[] args) {

        String str = "aaabbbccc";// unique //"abc

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            /*          char each = str.charAt(i);
          int f =  StringUtility.frequency(str, each);
          if(f == 1){
              unique += each;
          }

   */
            //if the frequency == 1 is unique
            if (StringUtility.frequency(str, str.charAt(i)) == 1) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);






        System.out.println("-finding frequency of every single char");

        String s = "aaabbcc";//"Frequency// a3b2c2
       String nonDup = StringUtility.removeDuplicates(s); // abc

        String result = "";

        for(int i = 0; i <nonDup.length(); i++){
            /*
            char ch = nonDup.charAt(i);
            int f = StringUtility.frequency(s, ch);
            result += "" + ch + f;// concat char and frequency

             */
            result += "" + nonDup.charAt(i) + StringUtility.frequency(s, nonDup.charAt(i));

        }
        System.out.println(result);


    }
}
