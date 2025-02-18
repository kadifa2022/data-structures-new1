package functionalInterfaces;

import java.util.List;

public class Generics <T>{//

    // generic method for any kind data
    public <T> void printEach(T [] array){
        for (T each : array) {
            System.out.println(each);
        }
    }
    public  <T> void printEach(List<T> list){
        for(T each : list){
            System.out.println(each);
        }

    }
}
