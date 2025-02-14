package Arrays;

public class WrapperClasses {
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;

        // autoboxing
        Byte x = a;
        Short y = b;
        Integer z = c;

        // unboxing

        // Wrapper methods
        // - parseInt()  : converting string text to the primitives

        String str = "123";
        int num1 = Integer.parseInt(str);
        System.out.println(num1);// 123

        // valueOf(): converting strings to the wrapper class objects, return wrapper class object
        String str2 = "1.5";
        Double num2= Double.valueOf(str2);
        System.out.println(num2);







    }
}
