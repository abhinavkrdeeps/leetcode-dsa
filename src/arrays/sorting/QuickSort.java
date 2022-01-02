package arrays.sorting;

public class QuickSort {

    public void print(Integer[] arr){
        StringBuilder s= new StringBuilder();
        for (Integer integer : arr) {
            s.append(integer).append(" ");
        }
        System.out.println(s);
    }

    public static void swap(Integer[] arr, Integer idx1, Integer idx2){
        Integer temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2]=temp;
    }
    public static Integer partition(Integer[] arr, int start,int end){
        int pivotIndex = start;
        int pivot = arr[end];
        for(int i= pivotIndex;i<=end-1;i++){
            if(arr[i]<pivot){
                swap(arr,i,pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr,pivotIndex,end);
        return pivotIndex;
    }

    public void quickSort(Integer[] arr, int start, int end){

        if(start<=end){
            int pivotIndex = partition(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }

    }

    public static void main(String[] args) {
        Integer [] unsorted = new Integer[]{25,17,31,13,2};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(unsorted,0,unsorted.length-1);
        quickSort.print(unsorted);


    }
}
