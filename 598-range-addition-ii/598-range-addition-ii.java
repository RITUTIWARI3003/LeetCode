class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minx = m , miny = n ;
        for(int[] val : ops){
            minx = Math.min(minx,val[0]);
            miny = Math.min(val[1],miny);
        }
         return minx * miny;
    }
}