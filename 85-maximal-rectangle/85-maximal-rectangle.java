class Solution {
       public static int maxRectangleArea(int ht[]){
        int n = ht.length;
        Stack<Integer> st = new Stack<>();
        
        int[] nse = new int[n];
        int pse[] = new int[n];
        st.push(0);
        
        for(int i = 1 ;i<n;i++){
            while(!st.empty() && ht[i]<ht[st.peek()]){
                nse[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            nse[st.peek()] = n;
            st.pop();
        }
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(!st.empty() && ht[i]<ht[st.peek()]){
                pse[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            pse[st.peek()] = -1;
            st.pop();
        }
        
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int w = nse[i]-pse[i]-1;
            int h = ht[i];
            maxArea = Math.max(maxArea,w*h);
            
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mat = new int[m][n];
        
        for(int i = 0;i<m;i++){
            for(int j = 0 ;j<n;j++){
                if(matrix[i][j] == '1'){
                    mat[i][j] = 1;
                }
                else mat[i][j] = 0;
            }
            
        }
        
        for(int i = 0 ;i<n;i++){
            for(int j = 1;j<m;j++){
                if(mat[j][i] == 1) mat[j][i] = 1+mat[j-1][i];
            }
        }
        int arr[] = new int[n];
        int ans = Integer.MIN_VALUE;
        for(int k = 0;k<m;k++){
        for(int i = 0 ; i<n;i++){
            arr[i] = mat[k][i];
            
        }
            ans = Math.max(ans,maxRectangleArea(arr));
            
        }
        
        return ans;
    }
}