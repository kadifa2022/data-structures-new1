package accenture;

public class IsOddOrEven {
    public static void main(String[] args) {
        int number = 21;
        // checking whether the number is even or odd
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");



        // with ternary operator
        // checking if the number is divisible by 2
        String status = number % 2 == 0 ? " is even " : " is odd";
        System.out.println(number + status);

    }


    }



