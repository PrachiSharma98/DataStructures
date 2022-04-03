
<!--Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true-->

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        //loop through the string
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            //determining whether it is opening brackets or not
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else { //if (c == ')' || c == ']' || c == '}')
                //try to match to the existing one on top of the stack
                if (stack.empty() || !c.equals(stack.pop())) {
                    return false;
                }
            }
        }
        
        if (!stack.empty()) {
            return false;
        }
        
        return true;
    }
}
