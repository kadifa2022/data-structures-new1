package lab6_CustomMethods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(endsLy("Friendly"));
        System.out.println(hasBad("ba"));
        System.out.println(atFirst("Hello"));
        System.out.println(isPalindrome("racecar"));
    }


    public static String doubleChar(String str) {// "The"

        String result = ""; //"TThhee";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            result += each;
            result += each;
        }
        return result;
    }

    public static boolean endsLy(String str) {

        return str.endsWith("ly");
    }

    public static boolean hasBad(String str) {
        if (str.equals("bad")) {
            return true;
        }

        if (str.length() < 4) {
            return false;

        }
        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;


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

    public static boolean isPalindrome(String str){
       return StringUtility.reverse(str).equalsIgnoreCase(str);

    }

}