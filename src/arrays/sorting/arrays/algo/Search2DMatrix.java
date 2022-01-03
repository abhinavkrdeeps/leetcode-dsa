package arrays.sorting.arrays.algo;

public class Search2DMatrix {
    public static boolean binarySearch(int[] row, int start, int end, int target){

        while(start<=end){
            int mid = (start+end)/2;
            if(row[mid]<target){
                start=mid+1;
            }else if(row[mid]>target){
                end=mid-1;
            }else{
                return true;
            }

        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for(int i=0;i<matrix.length;i++){
            found =binarySearch(matrix[i], 0, matrix[i].length-1,target);
            if(found){
                return true;
            }
        }
        return found;
    }

    public static void main(String[] args) {

    }
}
