package practice1;

public class BinarySearch_SearchAnElementInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 30, 4, 10, 40};
        int target = 10;
        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not passed in array");
        } else {
            System.out.println("Element found at index " + result);
            // Element found at index 3
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;// 4
        while (left <= right) {//0 <= 4, 3 <= 4
            int mid = left + (right - left) / 2; //2,3
            // check if target is present at mid
            if (array[mid] == target) { //4==10 10==10
                return mid; // target found at index mid
            }
            // if target is greater, ignore the left half
            if (array[mid] < target) { // 4<10
                left = mid + 1; // 3
            }
            // if target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        //target not found in array
        return -1;
    }
}

