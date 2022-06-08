class Solution {
    public void rotate(int[] nums, int k) {
      int arr[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int temp = (i+k) % nums.length;
            arr[temp] = nums[i];
        }
        for(int i =0;i<arr.length;i++){
            nums[i] = arr[i];
        }
        
    }
}
//[1 2 3 4 5]==[34512]45 == 3+3 5%5==0 == 4+3==7%5==2 1+3 =%5 =3 1+3 4%5==1 
// 0+3 == 3%5==3 1
//1+3 ==4%5 ==4 2
//2+3 == 5%5 == 0 3
// 3+3 ==6%5 ==1  4
//4+3 ==7%5 ==2 5