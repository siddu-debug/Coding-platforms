class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);

            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char openb = stack.pop();
                if((ch == ')' && openb != '(') ||
                   (ch == '}' && openb != '{') ||
                   (ch == ']' && openb != '[')){
                        return false;
                    }
                
            }
        }
        return stack.isEmpty();



    
    }
}
