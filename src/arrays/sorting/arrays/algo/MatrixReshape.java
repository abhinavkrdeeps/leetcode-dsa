package arrays.sorting.arrays.algo;

public class MatrixReshape {

    public int[][] reshapeMatrix(int[][] matrix, int r, int c){

        int n = matrix.length;
        int m = matrix[0].length;
        if(!((m*n)==(r*c))){
            return matrix;
        }
        int [][] reshaped = new int[r][c];
        int p=0;
        int q=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(q>=c){
                    q=0;
                    p++;
                    if(p>=r){
                        return matrix;
                    }
                    reshaped[p][q++]=matrix[i][j];
                }
                else{
                    reshaped[p][q++]=matrix[i][j];
                    System.out.println("p: "+p+" q: "+q+" i: "+i+" j: "+j);
                }
            }
        }


        return reshaped;
    }

    public static void main(String[] args) {
        int[][] reshaped = new MatrixReshape().reshapeMatrix(new int[][]{{1,2},{3,4}}, 4,1);
        for(int i=0;i< reshaped.length;i++){
            for(int j=0;j<reshaped[0].length;j++){
                System.out.print(reshaped[i][j]+" ");
            }
            System.out.println();
        }
    }
}
