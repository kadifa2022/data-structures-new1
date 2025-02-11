package lab6_CustomMethods;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {
        String result = comboString("Hello", "Hi");
        System.out.println(result);
        System.out.println(left2("Hel"));
        System.out.println(right2("java"));
        System.out.println(frontAgain("edited"));
        System.out.println(countHi("Hi Hi Hi Hi "));
        System.out.println(catDog("Cat cat Dog  "));

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

    public static boolean frontAgain(String str){

        if(str.length()<  2){
            return false;
        }
        return str.substring(0,2).equals(str.substring(str.length() -2));




    }


    public static int countHi(String str){
       return StringUtility.frequency(str, "Hi");


    }

    public static boolean catDog(String str){
     str =  str.toLowerCase();

       int countCat = StringUtility.frequency(str, "cat");
        int countDog = StringUtility.frequency(str, "dog");
        return countCat == countDog;


    }





}
