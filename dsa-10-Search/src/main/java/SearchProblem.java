public class SearchProblem {

    public static void main(String[] args) {

        int[] nums ={-1,3,4,0,5,6,7,8};
        System.out.println();

    }


    public int search(int[] array, int data) {
        // bindary search initials left and right
        // have a while loop(left<=right
        // calculate mid
        //compare == mid then return mid index
        //else if data <midn then right=mid-1
        //else left =mid+1
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(data ==array[mid]) return mid;
           else if (data<array[mid]) right=mid-1 ;
           else left = mid +1;
        }
        return -1;

    }


}
