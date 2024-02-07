package day2;

public class MainMethodWithArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);



        }
    }
}
// overload main method with different parameter.
// but JVM will not use this one for starting execution

class Second{
    public static void main(String[] args) {
        String [] str = {"Java", "apple","google"};// create string array and call the main method to provide this input
        MainMethodWithArgs.main(str);

    }
}
//