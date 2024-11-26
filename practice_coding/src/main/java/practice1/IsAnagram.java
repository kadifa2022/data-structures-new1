package practice1;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String s1="listen";//input 1
        String s2 = "silent";// input 2
        System.out.println(isAnagram(s1, s2)); // output true
        System.out.println(isAnagram2(s1,s2));
    }

    public static boolean isAnagram(String str1, String str2){
        // converting strings to character arrays and sort them
        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);// eilnst
        Arrays.sort(charArray2); // eilnst
        // compare sorted characters arrays
        return Arrays.equals(charArray1, charArray2);

    }

    public static boolean isAnagram2(String str1, String str2) {
        // converting
        char[] charsArray1 = str1.toCharArray();
        char[] charsArray2 = str2.toCharArray();
        // sorting with Arrays sort method
        Arrays.sort(charsArray1);
        Arrays.sort(charsArray2);
        //comparing with Arrays equals method
        return Arrays.equals(charsArray1, charsArray2);
    }

}
