package practice1;

public class IsPalindrome {
    public static void main(String[] args) {
        String testString = "level ";
        boolean result = isPalindrome(testString);
        System.out.println(result);
        System.out.println(isPalindrome2(testString));
    }
    public static boolean isPalindrome(String input) {
        if (input == null) {// edge case
            return false;
        }
        StringBuilder reversed = new StringBuilder(); // empty string
        for (int i = input.length()-1; i >= 0; i--) { // reverse the string
            reversed.append(input.charAt(i));
        }
        // compare string and return true or false
        if (input.equalsIgnoreCase(reversed.toString())) {// equal() comparing the values
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome2(String input){
        if(input == null){
          return true;
        }

        StringBuilder reversed = new StringBuilder();

        for(int i = input.length() -1; i >=0; i--){
            reversed.append(input.charAt(i));
        }
        if(input.equalsIgnoreCase(reversed.toString())){
            return  true;
        }else{
            return false;
        }
    }

}