import java.lang.reflect.Array;
import java.util.ArrayList;

public class numberOfThePeopleInTheBus {

    public static void main(String[] args) {
        ArrayList<int[]> busStop=new ArrayList<int[]>();


        busStop.add(new int[]{10,0});// 10 in bus 0 out first stop
        busStop.add(new int[]{3,5});// 3 in, out 5
        busStop.add(new int[]{2,5});// 2 in , out 5

        System.out.println(countPassengers(busStop));
        System.out.println(countPassengersInBus(busStop));



    }

    public static int countPassengers(ArrayList<int[]> stops){// o(n) complexity because is single one loop with size
        int numOfPeople=0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople=numOfPeople + stops.get(i)[0]-stops.get(i)[1];

        }
        return numOfPeople;
    }

    public static int countPassengersInBus(ArrayList<int[]> stops){
        int numOfPeople= 0;//initials variables
        for (int i = 0; i <stops.size() ; i++) {
            numOfPeople= numOfPeople + stops.get(i)[0]-stops.get(i)[1];

        }
        return numOfPeople;


    }
}
