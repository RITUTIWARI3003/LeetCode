class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] nse = new int[n];
         int[] pse = new int[n];
        
        s.push(0);
        for(int i = 1 ; i<n;i++){
        while(!s.empty() && arr[i]< arr[s.peek()]){
            nse[s.peek()] = i;
            s.pop();
        }
        s.push(i);}
        while(!s.empty()){
            nse[s.peek()] = n;
            s.pop();
        }
        
          s.push(n-1);
        for(int i = n-2;i>=0;i--){
        while(!s.empty() && arr[i]<= arr[s.peek()]){
            pse[s.peek()] = i;
            s.pop();
        }
        s.push(i);}
        while(!s.empty()){
            pse[s.peek()] = -1;
            s.pop();
        }
        
        long ans = 0;
        int m = 1000000000 + 7 ;
        
        for(int i = 0 ;i<n;i++){
            long starting = (i - pse[i]);
            long ending = (nse[i] - i);
            long prod = (starting%m * ending%m * (long)arr[i]%m)%m;
            ans = ((ans%m) + prod ) % m;
            
        }
        
       return (int)ans;
        
    }
}