package exception;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("World");
        Thread.sleep(3000);
        System.out.println("Hello");


        System.out.println("Word ");

        Thread.sleep(4000);
        System.out.println("How are you");
        sleep5sec();


//        System.out.println("Hello");
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){// checked exception
//            e.printStackTrace();}


}
public static void sleep5sec() throws InterruptedException {
    Thread.sleep(5000);
    System.out.println();

}
public static void test(){
        try {
            sleep5sec();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
}


}








