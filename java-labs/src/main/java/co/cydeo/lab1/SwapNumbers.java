package co.cydeo.lab1;

public class SwapNumbers {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        System.out.println("n1" + n1);
        System.out.println("n2" + n2);

        //Option-1 by using 3rd variable

//        int n3 =0;//3rd variable
//
//        n3 = n1;// n1=10 n2=20 n3=10
//        n1 = n2;// n1=20 n2=20 n3=10
//        n2 = n3;// n1=20 n2=10 n3=10

        //Option 2 - by using Arithmetic +,_ operations

        n2 = n1 + n2;
        n1 = n2 - n1;
        n2 = n2 - n1;

        System.out.println("n1" + n1);
        System.out.println("n2" + n2);



    }
}
