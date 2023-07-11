package co.cydeo.lab6_Methods;

public class StringUtility {
/* solution 1
    public static int frequency(String sentence, String word){

        int countWord = 0;

        for (int i = 0; i <= sentence.length() - word.length(); i++) {

            String each = sentence.substring(i, i + word.length());

            if(each.equals(word)){
                countWord++;
            }

        }
        return countWord;

    }

 */


        public static int frequency(String sentence, String word){

                int count= 0;

                while(sentence.contains(word)){
                        sentence= sentence.replaceFirst(word, "");
                        count++;
                }
                return count;


        }

}
