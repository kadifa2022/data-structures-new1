package lab5_String;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "xyzxyzxyz";

        //create String for unique characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            // if(result.indexOf(each) < 0 ){
            if (!result.contains("" + each)) {// contains()takes only char sequences
            result += each;                    // converted by using empty string "", and concat +
        }
    }
        System.out.println(result);








}

}
