package practice1;

public class ReverseString {
    public static void main(String[] args) {

        String inputStr = " Interview Happy"; // set input
        String reversedString = reversedString(inputStr); // set result
        System.out.println(reversedString); // print result
    }

    private static String reversedString(String input) {// function
        if(input == null){ // edge case
            return null;
        }
        // logic
        StringBuilder reversed = new StringBuilder(); // empty string
        // iterate all elements in reversed order
        for(int i = input.length() -1; i>= 0; i--){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();

    }
}