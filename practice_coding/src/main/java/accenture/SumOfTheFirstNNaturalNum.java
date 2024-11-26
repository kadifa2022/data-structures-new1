package accenture;

public class SumOfTheFirstNNaturalNum {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        for(int i = 1; i<= n; i++)
            sum += i;
        System.out.println(sum);

        // formula to find the sum of n terms
      // Sum =(Num * (Num + 1)/2 10 * (10 + 1)/2




        // solution 3 using recursion

        int num = 10;
        int sum1 = getSum(num);
        System.out.println(sum1);
    }

    private static int getSum(int num) {
        if(num == 0){
            return num;
        }
        return  num + getSum(num-1);
    }


}
