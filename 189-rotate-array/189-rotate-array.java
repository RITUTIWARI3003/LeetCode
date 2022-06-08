class Solution {
    public void rotate(int[] nums, int k) {
         int arr[] = new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            int temp = (i+k)%nums.length;
           
            arr[temp] = nums[i];
            
        }
        
        for(int i =0 ;i<nums.length;i++){
            nums[i] = arr[i];
        }
        
    }
}