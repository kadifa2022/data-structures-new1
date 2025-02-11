package lab6_CustomMethods;

public class StringUtility {

    public static void main(String[] args) {

    }
/*
    public static int frequency(String sentence, String word){
        int countWord =0;

        for(int i=0; i <=sentence.length() - word.length() ;i++){
            String each = sentence.substring(i, i + word.length());

            if(each.equals(word)){
                countWord ++;
            }
        }
        return countWord;
    }

 */


    //return the frequency of the given word from the given sentence
    public static int frequency(String sentence, String word) {

        int countWord = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            countWord++;
        }
        return countWord;
    }


    // frequency of one character from the string
    //                          "aabacde",     'a'
    public static int frequency(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }


    public static String reverse(String word) {

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char each = word.charAt(i);
            result += each;
        }
        return result;
    }

    public static String removeDuplicates(String str) {
        //create String for unique characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            // if(result.indexOf(each) < 0 ){
            if (!result.contains("" + each)) {// contains()takes only char sequences
                result += each;                    // converted by using empty string "", and concat +
            }
        }
       return result;

    }


}

