import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BoxAverage {
    public static void main(String[] args) throws IOException {
        // Input [uncomment & modify is required]
        ArrayList<Integer> ans = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        while (S.equals("FULL") == false) {

            ans.add(Integer.parseInt(S));
            S = br.readLine().trim();
        }
        // Output [uncomment & modify is required]
        System.out.print(boxAverage(ans));
    }

    public static int boxAverage(ArrayList<Integer> ans) {
        // This is default OUTPUT. You can change it
        int result = -404;

        // write your logic here
        // Initialize min and max
        int min = ans.get(0);
        int max = ans.get(0);

        // loop - find min and max
        for (Integer an : ans) {
            if(an>max) max = an;
            else if(an<min) min = an;

        }
        // return the average of min and max
        result = (int) Math.ceil((double) (min + max)/2);
        return result;
    }



}