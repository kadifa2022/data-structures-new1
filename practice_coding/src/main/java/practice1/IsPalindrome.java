package practice1;

public class IsPalindrome {
    public static void main(String[] args) {
        String testString = "Level";
        boolean result = isPalindrome(testString);
        System.out.println(result);
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
}