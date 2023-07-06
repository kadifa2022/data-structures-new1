package co.cydeo.lab1;

public class OrdinaryTask {

    public static void main(String[] args) {
        double rate =0.5;

        double delta = 200;//implicit casting java
                      //
        int   result = (int)(rate * rate +delta);//(rate *rate) + delta java is grouping this way (first * than +)


        int salary = 50000;
        int bonus = 5000;
        double  result1 = 2 * (salary + bonus);

        int time = 50;
        int mass =100;
        double result3 = 1 / time + 3 * mass;
        double resul4 = 1/(time + 2 * mass);

    }
}
