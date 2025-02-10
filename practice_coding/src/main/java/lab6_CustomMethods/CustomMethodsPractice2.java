package lab6_CustomMethods;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {
        String result = comboString("Hello", "Hi");
        System.out.println(result);
        System.out.println(left2("Hel"));
        System.out.println(right2("java"));

    }
    public static String comboString(String a, String b){


        if(a.length() > b.length()){
            return b + a + b;
        }else if(b.length() > a.length()){
           return  a + b + a;
        }
        return a + b;
    }

    public static String left2(String str){//"Hello"

        if(str.length() < 3){
            return str;
        }
        String s1 = str.substring(0,2); //"He
        String s2 = str.substring(2);//"llo"

        return s2 + s1; //"lloHe"
    }

    public static String right2(String str){ //Hello
        if(str.length() < 3){
            return str;
        }
        String s1 = str.substring(str.length() - 2); //lo
        String s2 = str.substring(0, str.length() -2); //Hel
        return s1 + s2;//"loHel"
    }





}
