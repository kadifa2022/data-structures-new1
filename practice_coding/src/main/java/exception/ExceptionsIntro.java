package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsIntro {      // checked exception from sleep(), and file() add in method signature
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {


        Integer[] arr = {10, 20, 30};
        //System.out.println(arr[20]); // unchecked exception(ArrayIndexOutOfBoundsException)

        //System.out.println("Java".charAt(-1));//unchecked exp. ArrayIndexOutOfBoundsException
        String s = null;
       // System.out.println(s.toLowerCase());// unchecked exp.NullPointerException


        System.out.println("Checked Exceptions------------------");
        // sleep(takes millis seconds as argument) and  pause execution of the code

     // Thread.sleep(3000);  // in thread class we have sleep() that poses execution time

        FileInputStream file = new FileInputStream("file path");// checked during to compile time

    }
}