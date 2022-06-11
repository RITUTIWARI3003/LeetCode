class Solution {
    public int maxVowels(String s, int k) {
        int count  = 0;
        for(int i = 0;i<=k-1;i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
            
        }
        int ans = 0;
        
        for(int j = k ;j<=(s.length()-1);j++){
            ans = Math.max(count,ans);
            if(s.charAt(j-k)=='a' || s.charAt(j-k)=='e' || s.charAt(j-k)=='i' ||s.charAt(j-k)=='o'||s.charAt(j-k)=='u') count--;
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' ||s.charAt(j)=='o'||s.charAt(j)=='u') count++;
            
        }
        ans = Math.max(count,ans);
        
        
        return ans;
    }
}