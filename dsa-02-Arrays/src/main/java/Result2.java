import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result2 {



        // Helper function to calculate the minimum number of operations for a point
        private static long getOperations(int currentPos, int targetPos, int dist) {
            // If the point is already in the correct position or no movement is required
            if (currentPos >= targetPos) {
                return 0;
            }

            // Otherwise calculate the required number of operations
            return (targetPos - currentPos + dist - 1) / dist;
        }

        // Main function to get the minimum number of operations to sort the points
        public static long getMinOperations(List<Integer> weights, List<Integer> dist) {
            int n = weights.size();

            // Create a list of points where each point is represented as (weight, distance, original index)
            List<Point> points = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                points.add(new Point(weights.get(i), dist.get(i), i));
            }

            // Sort points based on their weight
            points.sort((a, b) -> Integer.compare(a.weight, b.weight));

            // Variable to track the number of operations
            long operations = 0;

            // Track the current position of each point
            int currentPos = 0; // Start at the left-most position on the x-axis

            // Traverse through sorted points and calculate the operations required to move them
            for (Point p : points) {
                // The point's target position is where its current position must be (in sorted order)
                int targetPos = currentPos;
                operations += getOperations(p.originalPos, targetPos, p.dist);
                currentPos++; // Move to the next position on the x-axis for the next point
            }

            return operations;
        }

        // Helper class to represent a point with weight, dist, and original position
        static class Point {
            int weight;
            int dist;
            int originalPos;

            Point(int weight, int dist, int originalPos) {
                this.weight = weight;
                this.dist = dist;
                this.originalPos = originalPos;
            }
        }
    }

