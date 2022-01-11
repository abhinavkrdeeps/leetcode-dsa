package algo;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int idx=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }

    public int startRecSearch(int [] nums, int target, int start, int end){
        if(start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                return startRecSearch(nums, target, start, mid-1);
            } else {
                return startRecSearch(nums, target, mid+1, end);
            }
        }
        return -1;
    }

    public int recSearch(int [] nums,int target){
        return startRecSearch(nums,target,0,nums.length);
    }

    public static void main(String[] args) {
       int idx =  new BinarySearch().recSearch(new int[]{-1,0,3,5,9,12}, 5);
        System.out.println(idx);
    }
}
