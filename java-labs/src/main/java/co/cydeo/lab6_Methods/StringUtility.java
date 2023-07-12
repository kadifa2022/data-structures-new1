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

      // return the frequency of the given word from the given sentence
        //int returns how many
        public static int frequency(String sentence, String word){

                int count= 0;

                while(sentence.contains(word)){
                        sentence= sentence.replaceFirst(word, "");
                        count++;
                }
                return count;

        }
        //return the char frequency of given String word // " aabacde" "a
        public static int frequency(String str, char ch){
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) ==ch){
                    count++;
                }

            }
                   return count ;
        }


        public static String reverse(String word){
            String result = "";
                                                      // i: index number of the string (word) starting from last index
            for (int i = word.length()-1; i >=0 ; i--) {
                                                         //character: starting from last character to the first character
                char each = word.charAt(i);
                result +=each;                             //concatenating each character to result string

            }
            return result;
        }

        public static String removeDup(String str){
            String result ="";
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(!result.contains("" +each)){
                    result +=each;
                }

            }
            return result;
        }






}
