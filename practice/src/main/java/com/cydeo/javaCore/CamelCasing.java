package com.cydeo.javaCore;

public class CamelCasing {

    public static void main(String[] args) {

        System.out.println(cameCasing("ryataBajsj"));

    }

    public static String cameCasing(String str){
    String result= "";

    for(char each: str.toCharArray()) {
        if(each!=Character.toUpperCase(each)){
            result +=each;
        } else if (each == Character.toUpperCase(each)) {
            result += " " + Character.toUpperCase(each);
        }else{
            result +=str;
        }
    }
    return result.trim();
    }
}
