public class Task {

    public static long[] linearSearch(int[] array, int data){
        long[] result = new long[2];
        long startTime= System.currentTimeMillis();
        int comparisons = 0;
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if(array[i]==data){
                result[0]=System.currentTimeMillis()-startTime;
                result[1]=comparisons;
                return result;
            }
        }
        return new long[2];
    }


//
//    public static long[] binderySearchIterative(int [] array, int data){
//        long [] result = new long[2];
//        long startTime= System.currentTimeMillis();
//        int comparisons =0;
//        int left=0;
//        int right = array.length-1;
//        while(left<=right){
//            int middle = (left + right)/2;
//            comparisons ++;
//            if(array[middle]==data) return middle;
//            if(data<array[middle]) right = middle-1;
//            else left= middle-1;
//        }
//        return -1;
//    }
    public static int binderySearchRecursive(int [] array, int data){
        return binderySearchRecursive(array, data, 0, array.length-1);

    }
    public static int binderySearchRecursive(int [] array, int data, int left,int right){
        if(left>right) return -1;
        int middle= (left + right)/2;
        if(array[middle]==data) return middle;
        if (data<array[middle]) return binderySearchRecursive(array, data, left, middle-1);
        else return binderySearchRecursive(array, data, middle + 1, right);
    }



    public static int jumpSearch(int [] array, int data){
        int blockSize= (int)Math.sqrt(array.length);
        int start= 0;
        int next = blockSize;
        while(start<array.length && array[next-1]<data){
            start = next;
            next += blockSize;
            if(next>array.length) next=array.length;
        }
        for (int i = start; i < next ; i++){
            if(array[i]==data) return i;

        }
        return -1;
    }


    public static int ternarySearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;

        while (right >= left) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;
            if (array[middle1] == data) return middle1;
            if (array[middle2] == data) return middle2;
            if (data < array[middle2]) right = middle1 - 1;
            else if (data > middle2) left = middle2 + 1;
            else {
                left = middle1 + 1;
                right = middle2 - 1;

            }
        }
        return -1;
    }//end ternary

    public static int ternarySearchRecursive(int[] array, int data, int left, int right){
        if(left>right) return -1;
        int partition = (right - left) / 3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if(array[middle1] == data) return middle1;
        if(array[middle2] ==data) return  middle2;
        if(data<array[middle1]) return ternarySearchRecursive(array, data, left, middle1-1);
        if(data>array[middle2]) return ternarySearchRecursive(array, data, middle2 + 1, right);
        else return ternarySearchRecursive(array, data, middle1 + 1, middle2 -1);
    }



}


