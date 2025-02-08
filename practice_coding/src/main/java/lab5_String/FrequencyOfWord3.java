package lab5_String;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        //1. declare variable
        int countJava = 0; // we are assuming there is no java in sentence

        for (int i = 0; i <= sentence.length() - 4; i++) {// -1 changed to -4 to avoid indexBoundException
            String each = sentence.substring(i, i + 4);//creating all possible substrings with four characters

            if (each.equals("Java")) {// if the substring is equal to "Java" increment
                countJava++;// incrementing Java
            }
        }
        System.out.println(countJava);

        System.out.println(" ----frequency of the cat-------");

        String s = "Cat Cat Cat Dog Dog Dog Dog dog Dog";

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= s.length() - 3; i++) {// -1 changed to -3 to avoid indexBoundException(3 cat with 3 characters0
            String each = s.substring(i, i + 3);// crating all possible substring with 3 characters

            //System.out.println(eachCat);

            if(each.equals("Cat")) {
                countCat ++;
            }
            if(each.equalsIgnoreCase("Dog")){ // Included ignore case sensitivity
                countDog ++;
            }
        }
        System.out.println("Count Cat " + countCat);
        System.out.println("Count Dog " + countDog);
    }
}