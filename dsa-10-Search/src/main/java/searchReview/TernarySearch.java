package searchReview;

public class TernarySearch {
    public static void main(String[] args) {

    }
    public static int ternarySearchIterative(int [] array, int data){
        int left = 0;
        int right = array.length-1;
        while(right >=  left){ //continue this calculation
        int partition = (right -left) /3; // cast  to integer
        int middle1 = left + partition;
        int middle2 = right - partition;
        if(array[middle1] == data) return middle1;
        if(array[middle2] == data) return middle2;
        if(data<array[middle1]) right = middle1 - 1;
        else if(data> array[middle2]) left = middle2 + 1;
        else{
            left = middle1 + 1;
            right = middle2 -1;
        }
        }
        return -1;// if we can't find it return -1
    }// end of ternary

    public static int ternarySearchRecursive(int[] array, int data, int left, int right){
        if(left >right ) return -1;
        int partition = (right-left) /3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if(array[middle1] == data) return middle1;
        if(array[middle2] == data) return middle2;
        if(data<array[middle1]) return ternarySearchRecursive(array, data, left, middle1-1);
        if(data>array[middle2]) return ternarySearchRecursive(array, data, middle2 +1, right);
        else return ternarySearchRecursive(array, data, middle1 +1, middle2 -1);
    }
}
