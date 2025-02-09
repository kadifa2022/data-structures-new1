package lab5_String;

public class FrequencyOfWord2 {
    public static void main(String[] args) {


        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        int countJava = 0;

        //sentence.indexOf("Java") >= 0; // one way to provide expression

        while (sentence.contains("Java")) {// another way
            sentence = sentence.replaceFirst("Java", ""); // remove one "java" at the time
            // loop will continue until false
            countJava++; // increase the number of "Java" by 1
        }
        System.out.println(countJava);





String sentence2= "Monday Monday Monday Tuesday Tuesday Tuesday Monday";
int countMonday = 0;

while(sentence2.contains("Monday")){

    sentence2 = sentence2.replaceFirst("Monday", "");
    countMonday ++;
}

        System.out.println("Count Monday " + countMonday);









    }





    }

