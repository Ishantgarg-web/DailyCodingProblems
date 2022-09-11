// Problem Link: https://leetcode.com/problems/valid-parentheses/

/****
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

class Solution {
    public boolean isValid(String s) {
      /**
         * Approach: add open-paranthesis to stack
         * if close-paranthesis check if the peek
         * of the stack is the open-bracket needed.
         * if so, pop the open-paranthesis out
         * and check further, if not return false.
         * valid if stack is empty.
         */
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
        
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }else if(ch == '}' || ch == ']' || ch == ')'){
                
                if(stack.isEmpty() || stack.peek() != getOpeningBracket(ch)){
                    return false;
                }else { 
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
        
    }
    
    private static char getOpeningBracket(char ch){
        if(ch == '}') return '{';
        if(ch == ']') return '[';
        return '(';
    }
}
