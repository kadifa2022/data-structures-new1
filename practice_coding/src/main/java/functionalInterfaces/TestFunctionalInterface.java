package functionalInterfaces;

public class TestFunctionalInterface {

    public static void main(String[] args) {
                                    //(x is representing parameter that will be passing to the parameter
        MyFunctionalInterface<Integer> cube = x ->
            System.out.println(x * x * x);
        cube.function(10);
        //for generic T we are passing objects Integer, String , Double or (int[] as primitive type)
        MyFunctionalInterface <Integer>oddOrEven = a -> {
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
        };
        oddOrEven.function(10);
        oddOrEven.function(3);

        MyFunctionalInterface <String> reverse = (str)-> {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };
        reverse.function("Wooden spoon");



    }
}
