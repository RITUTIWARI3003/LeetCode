class Solution {
    public String makeGood(String s) {
        
        StringBuffer sb = new StringBuffer();
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        
        for(int i = 1;i<s.length();i++){
            if(!stk.empty() && stk.peek().toString().equalsIgnoreCase(String.valueOf(s.charAt(i))) &&
              stk.peek() != s.charAt(i) ) {
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        
        for(char ch : stk){
            sb.append(ch);
        }
         return sb.toString();
    }
}