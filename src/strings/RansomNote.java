package strings;
import java.util.*;


/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> freq1= new HashMap<>();
        Map<Character,Integer> freq2= new HashMap<>();
        for(Character c: ransomNote.toCharArray()){
            if(freq1.containsKey(c)){
                freq1.put(c,freq1.get(c)+1);
            }else{
                freq1.put(c,1);
            }
        }
        for(Character c: magazine.toCharArray()){
            if(freq2.containsKey(c)){
                freq2.put(c,freq2.get(c)+1);
            }else{
                freq2.put(c,1);
            }
        }
        boolean res=true;
        for(Map.Entry<Character,Integer> entry: freq1.entrySet()){
            int val = entry.getValue();
            if(freq2.containsKey(entry.getKey())){
                if(val>freq2.get(entry.getKey())){
                    res=false;
                    return res;
                }
            }else{
                return false;
            }
        }

        return res;
    }
}
