package practice1;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String s1="listen";//input 1
        String s2 = "silent";// input 2
        System.out.println(isAnagram(s1, s2)); // output true
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

}
