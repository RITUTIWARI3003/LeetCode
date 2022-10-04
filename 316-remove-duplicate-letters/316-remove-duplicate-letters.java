class Solution {
    public String removeDuplicateLetters(String st) {
        int n = st.length();
        Stack<Character> stk = new Stack<>();
        int freq[] = new int[26];
        
        for(int i = 0;i<n;i++){
            freq[st.charAt(i) - 'a']++;
        }
        
        int present[] = new int[26];
        Arrays.fill(present,0);
        
        stk.push(st.charAt(0));
        freq[st.charAt(0) - 'a']--;
        present[st.charAt(0) - 'a'] = 1;
        
        for(int i = 1;i<n;i++){
            freq[st.charAt(i) - 'a']--;
            if(present[st.charAt(i)-'a'] == 1) continue;
            while(!stk.empty() && st.charAt(i)<stk.peek() &&
                 freq[stk.peek()-'a']>0){
                present[stk.peek()-'a'] = 0;
                stk.pop();
            }
            stk.push(st.charAt(i));
            present[st.charAt(i) - 'a'] = 1;
        }
        
        Stack<Character> temp = new Stack<>();
        while(!stk.empty()){
            char val = stk.pop();
            temp.push(val);
        }
        String ans = "";
        while(!temp.empty()){
            ans += temp.pop();
        }
        return ans;
    }
}