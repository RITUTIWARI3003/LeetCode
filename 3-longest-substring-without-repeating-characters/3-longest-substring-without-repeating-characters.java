class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        if(s.equals(" ")) return 1;
        int freq[] = new int[256];
        Arrays.fill(freq,0);
        int i = 0,j =0,ans=1;
        freq[s.charAt(i)]++;
        while(j<s.length()-1){
            if(freq[s.charAt(j+1)] == 0){
                freq[s.charAt(j+1)]++;     
                j++;
            }else{
                freq[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}