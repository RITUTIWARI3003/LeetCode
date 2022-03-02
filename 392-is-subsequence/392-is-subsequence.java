class Solution {
    public boolean isSubsequence(String s, String t) {
        int j =0;
        if(s.length()==0) return true;//Managining Edge case
        for(int i =0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)) //checking if elements of s is present in t or not
                j++;
            if(j ==s.length()) break;//Managining Edge case
        }
        return j == s.length(); //if all the element is present then j will be equal to length of s
         
    }
}