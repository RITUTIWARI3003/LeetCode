class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans =0;// total number of arithmetic series
        int count =0; // counting elements present in one arithmetic series --> counting size 
        int n =nums.length;
        for(int i =1;i<n-1;i++){
            if(nums[i]-nums[i-1] == nums[i+1]-nums[i]) // checking the interval if equal then put it in
                                                      //arithmetic series
                count++; //check and increase size
        else{
            ans += (count *(count+1)/2) ; // if we get our a.s then calculate total number of arithmetic                                            //series --> sum of -->n-2 natural numbers
            count =0; //again checking for another a.s if exist
        }
        }
        
       ans += (count *(count+1)/2) ; //upadate the sum of all possible series
        return ans; //return ans
    }
}