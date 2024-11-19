package practice1;

public class FactorialOfANumber {

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println(factorial);

    }

    public static long  calculateFactorial(int num){
        if(num == 0){// edge case if number is 0
            return 1;
        }
        //why 1? because min factorial is 1 not 0
        long result = 1; // set initial value
        for(int i = 1; i<= num; i++){
           result = result * i;
        }
        return result;
    }

}
