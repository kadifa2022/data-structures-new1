package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        int [] numbers ={10,20,20,3,0};

        for(int each: numbers){
            System.out.println(each);
        }
        String []fruits = {"Orange", "Grape", "Banana", "Lemon", "Apple", "Strawberry"};

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
