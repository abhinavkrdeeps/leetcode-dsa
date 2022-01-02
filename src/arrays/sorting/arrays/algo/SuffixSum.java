package arrays.sorting.arrays.algo;

import java.util.*;

public class SuffixSum {
    public boolean containsDuplicate(int[] nums) {

        //boolean ans = false;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer x: nums){
            if(map.containsKey(x)){
                return true;
            }
            else{
                map.put(x,1);
            }
        }
        return false;

    }

    public static List<Integer> suffixSum(List<Integer> arr){
        List<Integer> suffixSum = new ArrayList<>();
        suffixSum.add(arr.get(arr.size()-1));
        int k=0;
        for(int i= arr.size()-2;i>=0;i--){
            int val = arr.get(i)+suffixSum.get(k);
            suffixSum.add(val);
            k++;
        }

        Collections.reverse(suffixSum);
        return suffixSum;
    }
    public int solve(List<Integer> A, int B) {
        ArrayList<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = suffixSum(A);
        System.out.println(suffix);
        if(A.size()==0){
            return -1;
        }
        prefix.add(A.get(0));
      //  suffix.add(A.get(A.size()-1));
        for(int i=1;i<A.size();i++){
            int nextVal = A.get(i)+prefix.get(i-1);
            prefix.add(nextVal);
        }

        System.out.println("A: "+A.size()+" suffix: "+suffix.size()+" prefix: "+prefix.size());

        int maxValue = Integer.MIN_VALUE;
        for(int i=1;i<B;i++){
            int l = i;
            int r = (A.size())-(B-l);
            maxValue = Math.max(maxValue, prefix.get(l-1)+suffix.get(r));
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
        System.out.println(new SuffixSum().solve(Arrays.asList(arr),48));
    }
}
