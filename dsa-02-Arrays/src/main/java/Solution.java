import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> weights = new ArrayList<>();
        List<Integer> dist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            weights.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            dist.add(sc.nextInt());
        }

        // Get the minimum operations
        System.out.println(Result2.getMinOperations(weights, dist));
        sc.close();
    }
}
