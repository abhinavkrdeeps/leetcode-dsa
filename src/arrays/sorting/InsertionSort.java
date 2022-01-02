package arrays.sorting;

public class InsertionSort {

    public void print(Integer arr[]){
        StringBuilder s= new StringBuilder();
        for (Integer integer : arr) {
            s.append(integer+" ");
        }
        System.out.println(s);
    }

    public void swap(Integer[] arr, Integer idx1, Integer idx2){
        Integer temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2]=temp;
    }

    public Integer[]  insertionSort(Integer[] unsorted){
        int n = unsorted.length;
        for(int i=1;i<n;i++){
            int key=unsorted[i];
            int j=i-1;
            for (j=i-1;j>=0 && unsorted[j]>key;j--){
               swap(unsorted,j,j+1);
            }
            unsorted[j+1]=key;
        }
        return unsorted;
    }

    public static void main(String[] args) {
        Integer [] unsorted = new Integer[]{25,17,31,13,2};
        InsertionSort insertionSort = new InsertionSort();
        Integer [] sorted = insertionSort.insertionSort(unsorted);
        insertionSort.print(sorted);


    }
}
