package arrays.sorting;

import com.sun.scenario.effect.Merge;

public class MergeSort {

    public void print(Integer arr[]){
        StringBuilder s= new StringBuilder();
        for (Integer integer : arr) {
            s.append(integer+" ");
        }
        System.out.println(s);
    }

    public static void conquer(Integer[] arr, int startIdx1, int endIdx1, int startIdx2, int endIdx2 ){

        Integer [] aux = new Integer[endIdx2-startIdx1+1];
        int i=startIdx1;
        int j= startIdx2;
        int k=0;
        while (i<=endIdx1 && j<=endIdx2){
            if(arr[i]<=arr[j]){
                aux[k++]=arr[i++];
            }else{
                aux[k++]=arr[j++];
            }
        }

        while (i<=endIdx1){
            aux[k++]=arr[i++];
        }
        while (j<=endIdx2){
            aux[k++]=arr[j++];
        }

        for(int l=startIdx1;l<=endIdx2;l++){
            arr[l] = aux[l-startIdx1];
        }
    }

    public void divide(Integer[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);
           conquer(arr,start,mid,mid+1,end);
        }

    }


    public static void main(String[] args) {
        Integer [] unsorted = new Integer[]{25,17,31,13,2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.divide(unsorted,0,unsorted.length-1);
        mergeSort.print(unsorted);


    }
}
