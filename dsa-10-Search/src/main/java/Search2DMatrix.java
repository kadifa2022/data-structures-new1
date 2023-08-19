public class Search2DMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,7));
    }

    public static boolean searchMatrix(int [][] matrix, int target){
        // number of rows and colum
        int numberOfCols=matrix[0].length;
        int numberOfRow =matrix.length;
        int currentRow =0;
        while (currentRow<numberOfRow-1){
            if(target>matrix[currentRow] [numberOfCols-1]) currentRow++;
            else break;
        }
    // binary search in current row
        int left = 0;
        int right = numberOfCols-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==matrix[currentRow][mid]) return true;
            else if (target<matrix[currentRow] [mid]) right = mid-1;
            else left = mid+1;

            }
        return false;
        }

    public static boolean searchMatrixLogNM(int [][] matrix, int target){
        return false;

    }
}
