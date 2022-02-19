class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // to keep the track
        
    for( int ele:nums){ 
        if(ele!=val){
            nums[index++] = ele; //filling only elements in the nums array which is not equal to val
        }
    }
        
     return index;   //returning the no.of elemwnts present in val
    }
}