package strings;
import java.util.*;


/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freq1 = new HashMap<>();
        Map<Character,Integer> freq2 = new HashMap<>();

        for(Character c: s.toCharArray()){
            if(freq1.containsKey(c)){
                freq1.put(c,freq1.get(c)+1);
            }else{
                freq1.put(c,1);
            }
        }

        for(Character c: t.toCharArray()){
            if(freq2.containsKey(c)){
                freq2.put(c,freq2.get(c)+1);
            }else{
                freq2.put(c,1);
            }
        }
        System.out.println(freq1);
        System.out.println(freq2);
        boolean ans = true;
        for(Map.Entry<Character,Integer> entry: freq1.entrySet()){
            if(freq2.containsKey(entry.getKey())){
                if(!Objects.equals(freq2.get(entry.getKey()), entry.getValue())){
                    System.out.println("freq2.get(entry.getKey(): "+freq2.get(entry.getKey())+" entry.getValue() "+entry.getValue());
                    return false;
                }
            }else{
                System.out.println("freq2.get(entry.getKey(): "+freq2.get(entry.getKey())+" entry.getValue() "+entry.getValue());
                return false;
            }
        }
        for(Map.Entry<Character,Integer> entry: freq2.entrySet()){
            if(freq1.containsKey(entry.getKey())){
                if(!Objects.equals(freq1.get(entry.getKey()), entry.getValue())){
                    System.out.println("freq2.get(entry.getKey(): "+freq2.get(entry.getKey())+" entry.getValue() "+entry.getValue());
                    return false;
                }
            }else{
                System.out.println("freq2.get(entry.getKey(): "+freq2.get(entry.getKey())+" entry.getValue() "+entry.getValue());
                return false;
            }
        }
        return ans;

    }
}
