package practice1;

public class BubbleSort {

    public static void main(String[] args) {

    }

    public static void bubbleSortArray(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {// outer for loop
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // inner for loop
                if (array[j] > array[j + 1]) {
                    // swap array [j] and array[j+1]

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no two elements were swapped by inner loop, then break
            // no elements inside inner array
            if(!swapped) break;
            }
        }
    }

