package practice1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        generateFibonacci(n);

    }
    public static void generateFibonacci(int n) {
        int a =0, b=1; // starting point
        System.out.println(+ a + ", " + b);

        for (int i =2; i < n; i++){
            int next = a+b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }

    }

}
