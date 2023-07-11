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

        System.out.println("-----------FrontAgain -----------");
        System.out.println(frontAgain("Edited"));

        System.out.println("------------countHi and used frequency() from StringUtility custom class----------");
        System.out.println(countHi("Hi hi Hi Hi  Hi yes yes "));

        System.out.println("------------------catDog -------------------");

        System.out.println(catDog("cat dog cat dog cat dog "));


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

    public static boolean frontAgain(String str){
        if(str.length()<2){// if the string is less than 2 characters
            return false;
        }

        String firstTwoChars = str.substring(0,1);
        String lastTwoChars = str.substring(str.length()-2);


        //return str.endsWith(firstTwoChars);// second solution
        return firstTwoChars.equals(lastTwoChars);


        //third solution
        // comparing if the first 2 character of the string equals to the last 2 characters of the string
       // return str.substring(0,2).equals(str.substring(str.length()-2));


    }

    public static int countHi(String str){// calling methode from utility class
        return  StringUtility.frequency(str, "Hi");


    }

    public static boolean catDog(String str){

        str=str.toLowerCase(); // converting string to lower case

       int countCat = StringUtility.frequency(str, "cat");// frequency of cat and dog separately
       int countDog = StringUtility.frequency(str, "dog");
       // comparing if is even
       return countCat == countDog;






    }













}
