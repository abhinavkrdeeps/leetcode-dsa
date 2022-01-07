package stacks;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesis {
    class Solution {
        public boolean isValid(String s) {
            boolean isValid = true;
            Stack<Character> st = new Stack<>();
            for(Character c: s.toCharArray()){
                if(c=='(' || c=='{' || c=='['){
                    st.push(c);
                }else{
                    if(st.isEmpty()){
                        return false;
                    }
                    Character top = st.peek();
                    if((c==')' && top =='(') || (c=='}' && top =='{') || (c==']' && top =='[')){
                        st.pop();
                    }else{
                        isValid=false;
                        return isValid;
                    }
                }
            }

            if(!st.isEmpty()){
                return false;
            }else{
                return true;
            }
        }
    }

    public static void main(String[] args) {

    }
}
