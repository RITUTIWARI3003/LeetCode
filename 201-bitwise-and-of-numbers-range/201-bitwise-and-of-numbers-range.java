class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        long mask = (1L << 31) ; 
        int ans  = 0;
        while(mask>0){
            if((mask & left) == (mask & right)){
                if((mask & left) != 0) ans += mask;
                mask >>=1;
            }
            else break;
        }
        return ans;
        
    }
}