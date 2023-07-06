package co.cydeo.lab2;

public class AppleTask {
    public static void main(String[] args) {


        int app1 = 10;
        int app2 = 10;
        int app3 = 10;
        int app4 = 20;
        int app5 = 10;
        int app6 = 10;
        int app7 = 10;

        int sum1 = app1 + app2 + app3;
        int sum2 = app4 + app5 + app6;

        if (sum1 == sum2) {
            System.out.println("Found it ! Apple (7" + app7 + "gr) is heavier than other");
        } else {
            if (sum1 > sum2) {
                if (app1 == app2) {
                    System.out.println("Found it ! Apple (3" + app3 + "gr) is heavier than other");
                } else {
                    if (app1 > app2) {
                        System.out.println("Found it ! Apple (1" + app1 + "gr) is heavier than other");
                    } else {
                        System.out.println("Found it ! Apple (2" + app2 + "gr) is heavier than other");
                    }
                }

            } else {
                if (app4 == app5) {
                    System.out.println("Found it ! Apple (6" + app6 + "gr) is heavier than other");

                } else {
                    if (app4 > app5) {
                        System.out.println("Found it ! Apple (4" + app4 + "gr) is heavier than other");
                    } else {
                        System.out.println("Found it ! Apple (5" + app5 + "gr) is heavier than other");
                    }

                }

            }


        }
    }
}