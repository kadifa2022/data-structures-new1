package stackReview;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(2));
        System.out.println(recursiveFibonacci(3));
        System.out.println(recursiveFibonacci(8));

    }
    public static int recursiveFibonacci(int num){
        if(num == 0) return 0; // termination /base condition
        if(num == 1) return 1;
        return recursiveFibonacci(num-1) + recursiveFibonacci(num-2);



    }

}
