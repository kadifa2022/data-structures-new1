import java.util.List;

public class Result {
    public static void main(String[] args) {
        System.out.println(isSpecialSequence("abdacd"));

    }

    // Helper method to check if a substring is a palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String isSpecialSequence(String dna_sequence) {
        if (dna_sequence == null || dna_sequence.length() <= 1) {
            return "NO"; // Edge case: trivial cases are not special
        }

        int left = 0;
        int right = dna_sequence.length() - 1;

        while (left < right) {
            if (dna_sequence.charAt(left) != dna_sequence.charAt(right)) {
                // Check if removing one character from either side forms a palindrome
                if (isPalindrome(dna_sequence, left + 1, right) || isPalindrome(dna_sequence, left, right - 1)) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
            left++;
            right--;
        }

        // If no mismatch is found, the whole string is already a palindrome
        return "YES";
    }


}


