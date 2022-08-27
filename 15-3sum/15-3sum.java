class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> semiAns = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
        
        
                int rem =  -1 * (nums[i]);
        
        
                int p1 = i+1;
                int p2 = n-1;
                
                while(p1<p2){
                    if((nums[p1]+nums[p2])<rem) p1++;
                    else if((nums[p1]+nums[p2])>rem) p2--;
                    else{
                        semiAns.add(nums[i]);
                        semiAns.add(nums[p1]);
                        semiAns.add(nums[p2]);
                        ans.add(new ArrayList(semiAns));
                        semiAns.removeAll(semiAns);
                        
                        if(nums[p1] == nums[p2])  break;
                        int x = nums[p1] , y = nums[p2];
                        while(nums[p1] == x) p1++;
                        while(nums[p2]==y) p2--;
                        
                    }
                }
        }
        return ans;
        
    }
}
