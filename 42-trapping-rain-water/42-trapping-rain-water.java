class Solution {
     public static int[] prefix(int[] arr){
        int pmax[] = new int[arr.length];
        pmax[0] =arr[0];             
        for(int i = 1;i<arr.length;i++){ 
            pmax[i] = Math.max(pmax[i-1],arr[i]);
        }
        return pmax;
    } 
    
    public static int[] suffix(int[] arr){
        int smax[] = new int[arr.length];     
        smax[arr.length-1] = arr[arr.length-1]; 
        for(int i = arr.length-2;i>=0;i--){  
            smax[i] = Math.max(smax[i+1],arr[i]);
        }
      
         return smax;
    }
    
    public int trap(int[] h) {
        
         int pmax[]= prefix(h);
	    int smax[]= suffix(h);
        int totalWater = 0 ;
        for(int i = 1 ;i<h.length-1;i++){
            int min = Math.min(pmax[i-1],smax[i+1]);
            
            if(min>h[i]){
                totalWater += (min-h[i]);
                
            }
                
            
            
        }
        return totalWater;
       
        
        
        
        
        
    }
}