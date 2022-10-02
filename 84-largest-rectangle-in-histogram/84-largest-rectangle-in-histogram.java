class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        
        int[] nse = new int[n];
         int[] pse = new int[n];
        
        s.push(0);
        
        for(int i = 1;i<n;i++){
            while(!s.empty() && heights[i]<heights[s.peek()]){
                nse[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        while(!s.empty()){
            nse[s.peek()] = n;
            s.pop();
        }
        
         s.push(n-1);
        
        for(int i = n-2;i>=0;i--){
            while(!s.empty() && heights[i]<heights[s.peek()]){
                pse[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        while(!s.empty()){
            pse[s.peek()] = -1;
            s.pop();
        }
        
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxArea = Math.max(maxArea,((nse[i]-pse[i]-1)*heights[i]));
        }
        return maxArea;
    }
}