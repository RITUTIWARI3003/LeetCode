class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        int k =0;
        Arrays.sort(nums);
        
        for(int i = 0 ;i<n ;){
           // if(k==2) break;
            if(i!=(n-1) && nums[i+1] == nums[i]) i = i+2;
            else {
                ans[k] = nums[i];
                k++;
                i++;
            }
            if(i+1 == (n-1) && k !=2) ans[k] = nums[n-1];
        }
        return ans;
    }
}