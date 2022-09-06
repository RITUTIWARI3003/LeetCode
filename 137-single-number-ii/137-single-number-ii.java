class Solution {
    public int singleNumber(int[] nums) {
        long mask = (1L<<31);
        int ans = 0;
        
        for(int i = 31;i>=0;i--){
            int count = 0 ;
            for(int j = 0 ;j<nums.length;j++){
                if((mask & nums[j]) != 0) count++;
            }
            if(count %3 != 0) ans += mask;
            mask >>= 1;
        }
        return ans;
    }
}