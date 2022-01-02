package arrays.sorting.arrays.algo;

import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
            set.add(nums[i]);
        }
        int idx1=-1;
        int idx2=-1;
        System.out.println(map);
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(set.contains(rem)){
                idx1=i;
                for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                    if(entry.getValue().equals(rem)){

                        idx2=entry.getKey();
                        System.out.println("idx1: "+idx1+" idx2: "+idx2+" i: "+i);
                        if(i!=idx2){
                            return new int[]{idx1,idx2};
                        }
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        //list.toArray(new int[]);
        System.out.println("idx1: "+idx1+" idx2: "+idx2);
        return new int[]{idx1,idx2};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,4,11,3},6));
    }
}
