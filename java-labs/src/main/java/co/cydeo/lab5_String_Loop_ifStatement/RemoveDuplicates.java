package co.cydeo.lab5_String_Loop_ifStatement;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {// loop is getting each character from string and adding to result
            char each = str.charAt(i);// to get each character  and add to result
            // condition for
            // if(result.indexOf(each)<0)
            if (!result.contains("" + each)) {// before adding character to a new string, we check if the character is not included in the new string
                // avoiding duplicates
                result += each;//concatenation


            }
            System.out.println(result);
        }
    }
}