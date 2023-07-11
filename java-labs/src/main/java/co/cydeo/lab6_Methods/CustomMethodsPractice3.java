package co.cydeo.lab6_Methods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));

        System.out.println(endsLy("finally"));

    }




    //The
     public static String doubleChar(String str) {


        String result = "";// store result-> "TThhee"

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);//i have all characters from giving string

            //result+=each + each;//(each + each= number )

            result += each; // concatenating twice  same letter
            result += each;
        }

      return result;
    }

    public static boolean endsLy(String str){
        return str.endsWith("ly");
    }





}
