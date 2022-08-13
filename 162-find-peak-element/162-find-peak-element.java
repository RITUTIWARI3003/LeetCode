class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0 , m =0 , h = n-1;
        if(n==1) return 0;
        while(l<=h){
            m = (l+h)/2;
            // Answer Detection
             if (m == n-1  && arr[m] > arr[m-1] ) return m;
            
            // Answer Detection
            else  if (  m == 0 && arr[m] > arr[m+1]) return m;
            // Answer Detection
           
            // Answer Detection
          else  if(arr[m]>arr[m+1] && arr[m]>arr[m-1]) return m;
           
            // Move right
            if(arr[m] < arr[m+1]) l = m+1;
            
            // move left
             else h = m-1;
            
        }
        return -1;
    }
}