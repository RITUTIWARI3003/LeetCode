public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        long mask = (1L << 31);
        int count  = 0;
        while(mask!=0){
            if((n & mask) != 0 ) count++;
            mask >>= 1;
        }
        return count;
    }
}