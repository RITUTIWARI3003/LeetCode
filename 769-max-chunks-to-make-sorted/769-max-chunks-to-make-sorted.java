class Solution {
   public static int[] prefix(int[] arr){
       int pmax[] = new int[arr.length];
       pmax[0]  = arr[0];
       for(int i =1;i<arr.length;i++){
           pmax[i] = Math.max(pmax[i-1],arr[i]);
       }
       return pmax;
   }
    
    public int maxChunksToSorted(int[] arr) {
        
        int maxArray[] = prefix(arr);
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(maxArray[i] == i) count++;
        }
      return  count;
      
}
}