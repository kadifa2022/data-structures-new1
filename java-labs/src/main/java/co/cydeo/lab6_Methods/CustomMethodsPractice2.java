package co.cydeo.lab6_Methods;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {


        System.out.println("---------comboString-------------");
        String result1 =(comboString("Hello", "Java"));//assign variable from method
        System.out.println(result1);

        System.out.println("---------left2-------------");
        System.out.println(left2("Hello"));

        System.out.println("----------right2------------");
        System.out.println(right2("Java"));

        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");

    }


    public static String comboString(String a, String b){

        if(a.length() > b.length()){
            return b + a + b;// if (a) is longer  string
        }else if(b.length() > a.length()){
            return a + b + a;//if (b) is longer string
        }else{
            return a+b;// if both strings are equal
        }


    }
    public static String left2(String str){//"Hello
        if(str.length()<3){
            return str;
        }
        String s1 = str.substring(0,2);//"He"
        String s2 =str.substring(2);//"llo"

       return s2+s1;






    }

    public static String right2(String str){//"Hello"

        if(str.length()<3){
            return str;
        }
        String s1 = str.substring(str.length()-2);//"lo"
        String s2 = str.substring(0, str.length()-2);//"Hel"
                return s1+s2;//"loHel"
    }








}
