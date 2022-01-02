package arrays.sorting.arrays.algo;
import java.util.*;
public class ArrayIntersection {
    public Integer[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> freq1 = new HashMap<>();
        Map<Integer,Integer> freq2 = new HashMap<>();
        for(Integer num: nums1){
            if(freq1.containsKey(num)){
                freq1.put(num, freq1.get(num)+1);
            }else{
                freq1.put(num,1);
            }
        }
        for(Integer num: nums2){
            if(freq2.containsKey(num)){
                freq2.put(num, freq1.get(num)+1);
            }else{
                freq2.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: freq1.entrySet()){
            int num = entry.getKey();
            if(freq2.containsKey(num)){
                int total = (entry.getValue()>=freq2.get(num))?freq2.get(num):entry.getValue();
                for(int i=1;i<=total;i++){
                    list.add(num);
                }
            }
        }

        return list.toArray(new Integer[0]);


    }
}
