package co.cydeo.lab6_Methods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));

        System.out.println(endsLy("finally"));
        System.out.println(hasBad("xxbad"));
        System.out.println(atFirst("a1"));

        System.out.println(isPalindrome("Cydeo"));

    }


    //The
    public static String doubleChar(String str) {


        String result = "";// store result-> "TThhee"

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);//i have all characters from giving string

            //result+=each + each;//(each + each= number )

            result += each; // concatenating twice  same letter
            result += each;
        }

        return result;
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static boolean hasBad(String str) {

        if (str.equals("bad")) {//if the string (word) equals
            return true;
        }
        if (str.length() < 4) {//if the length of the string does not have enough characters
            return false;
        }
        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;
        }

        return false;// otherwise false
    }

    public static String atFirst(String str) {

        if (str.isEmpty()) {
            return "@@";
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }

    }

    public static boolean isPalindrome(String str) {

       return  StringUtility.reverse(str).equalsIgnoreCase(str);

    }




}
