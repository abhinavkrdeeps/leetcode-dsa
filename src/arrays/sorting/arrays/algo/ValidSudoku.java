package arrays.sorting.arrays.algo;

import java.util.Arrays;

public class ValidSudoku {
    public static boolean checkGrid(char[][] mat, int r, int c){
        int n=r+2;
        int m= c+2;
        int [] temp = new int[10];
        for(int i=r;i<=n;i++){
            for(int j=c;j<=m;j++){
                int val = Character.getNumericValue(mat[i][j]);
                if(val>=0 && val<=9){
                    temp[val]++;
                }
            }
        }
        for(int i=1;i<=9;i++){
            System.out.print(temp[i]+" ");
            if(temp[i]>=2){
                return false;
            }
        }
        System.out.println();
        return true;

    }
    public boolean isValidSudoku(char[][] mat) {
        boolean isValid=true;
        // test row
        for(int i=0;i<9;i++){
            int [] temp = new int[10];
            Arrays.fill(temp,0);
            for(int j=0;j<9;j++){
                int val = Character.getNumericValue(mat[i][j]);
                if(val>=0 && val<=9){
                    temp[val]++;
                }
            }
            for(int k=0;k<=9;k++){
                if(temp[k]>=2){
                    isValid=false;
                    break;
                }
            }
            if(!isValid){
                break;
            }
        }

        // test Column
        for(int j=0;j<9;j++){
            int [] temp = new int[10];
            for(int i=0;i<9;i++){
                int val = Character.getNumericValue(mat[i][j]);
                if(val>=0 && val<=9){
                    temp[val]++;
                }
            }
            for(int k=1;k<=9;k++){
                if(temp[k]>=2){
                    isValid=false;
                    break;
                }
            }
            if(!isValid){
                break;
            }
        }
        // test grid
        if(isValid){
            for(int i =0;i<9;i=i+3){
                for(int j=0;j<9;j=j+3){
                    isValid = checkGrid(mat,i,j);
                    if(!isValid){
                        break;
                    }
                }
                if(!isValid){
                    break;
                }
            }
        }

        return isValid;

    }
}
