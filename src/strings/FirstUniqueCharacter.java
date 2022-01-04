package strings;
import java.util.*;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq = new LinkedHashMap<>();
        for(Character c: s.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);
            }else{
                freq.put(c,1);
            }
        }
        int idx=-1;
        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
            if(entry.getValue()==1){
                char res =  entry.getKey();
                for(int i=0;i<s.length();i++){
                    if(res==s.charAt(i)){
                        idx=i;
                        break;
                    }
                }
                break;
            }
        }
        return idx;
    }
}
