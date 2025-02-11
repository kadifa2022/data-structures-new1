package Arrays;


import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //Create a variable named numbers that can have 5 integers
        int[] numbers = new int[5];
        numbers[0] = 30;
        numbers[1] = 20;
        numbers[2] = 40;
        numbers[3] = 50;
        numbers[4] = 30;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        //Create a variable named colors that has: Yellow, Red, White, Blue, Green, Black

        String[] colors = {"Yellow", "Red", "Black", "White", "Blue", "Green"};
        System.out.println(Arrays.toString(colors));

        System.out.println((colors.length));
    }



}
