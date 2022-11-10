package com.cydeo.hashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        System.out.println(validAnagram("anagram", "gramana"));

    }

    public static boolean validAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1=new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char c= str1.charAt(i);
            if(!(map1.containsKey(c))){
                map1.put(c,1);
            }else{
                map1.put(c,map1.get(c) +1);
            }

        }
        System.out.println();

        for (int i = 0; i < str2.length(); i++) {
            char s= str2.charAt(i);
            if(map1.containsKey(s)){
                if(map1.get(s)!=1){
                    map1.put(s, map1.get(s)-1);
                    System.out.println(map1);

                }else{
                    map1.remove(s);
                    System.out.println(map1);
                }
            }else{
                return false;
            }

        }
        return map1.isEmpty();
    }


}
