package co.cydeo.lab6_Methods;

public class CustomMethodsPractice {

    public static void main(String[] args) {
       String str1 = helloName("James");// assign to variable
        System.out.println(helloName("James"));// print data

        System.out.println("-----------makeAbba--------------");
        System.out.println(makeAbba("Hi", "Bye"));

        System.out.println("-----------ExtraEnd--------------");
        System.out.println(extraEnd("Hello" ));
        System.out.println(extraEnd("s"));
        System.out.println(extraEnd("ka"));

        System.out.println("-----------FirstTwoCharacters--------------");
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("s"));

        System.out.println("---------------withoutEnd--------------------------");
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("School"));





    }
  /*
    public static void helloName(String name){
        String result = "Hello" + name + "!";
        System.out.println(result);
    }

   */

    public static String helloName(String name){
        String result = "Hello " + name+ "!";
        return result;

    }

    public static String makeAbba(String a, String b){
        String result = a+b+b+a;// or
//        result +=a;
//        result +=b;
//        result +=b;
//        result +=a;
        return result;
    }

    public static String extraEnd(String str) {
        if(str.length()<2){// if given string is less than 2 characters return given string
            return str;
        }
//        String substring = str.substring(str.length() -2);// last 2 characters of given string
//        String result = substring.repeat(3);//repeat last 2 characters 3 time
        return str.substring(str.length()-2).repeat(3);
    }

    public static String firstTwo(String str){
     /*   if(str.length()<2){// if this condition is true return str
            return str;
        }
        return ""+str.charAt(0)+ str.charAt(1);//( charAt() it will give us addition), we converted chars to empty "" used  concatenation

      */

        if(str.length()>=2){// if given string is more than 2 characters create substring from First(0) and second(1) character
            return str.substring(0,2);// to capture first and second index we are adding additions +1
        }else {// if is lass than 2 characters return given string
            return str;
        }


    }

    public static String withoutEnd(String str){
        if(str.length()>=3){
          return  str.substring(1, str.length()-1);

        }else{

            return str;
        }
    }









}


