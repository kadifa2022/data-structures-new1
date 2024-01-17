package reviewLinkedList;

public class IsPowerOfTwo { // leetcode 231

    // recursion
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));

    }

    public static boolean isPowerOfTwo(int n){// nlog(n) because we are dividing all the time with 2

        // base condition always need for recursion
        if(n == 1 ) return true;
        if (n%2!=0 || n <=0) return false;
        return isPowerOfTwo(n/2);

    }


}
