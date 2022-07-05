class Solution {
   
  String genrateBitFun(int num, int n){
      
      String value = "";
      
       
      if(num==0){
          value = "" + num;
          
          
      }else {
          int x = num ;
          while(x>0){
              int rem = x%2;
              x = x/2;
              value = rem +value;
              
          }
      }
      
       if(value.length()<n){
           int length = n-(value.length());
           for(int i =0;i<length;i++){
               value = "0" + value;
           }
       }
      return value;
      
      

   }
   
   public List<List<Integer>> subsets(int[] nums) {
       
       List<List<Integer>> value = new ArrayList<>();
       int n = nums.length;
       for(int i = 0;i<Math.pow(2,n);i++){
           List<Integer> v = new ArrayList<>();
           String s = genrateBitFun(i,n);
           for(int j =0;j<s.length();j++){
               if(s.charAt(j)=='1'){
                   v.add(nums[j]);
               }
           }
           value.add(v);
       }
       return value;
      
    
      
      
   }
}