// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int len=S.length();
        int zero=-1;
        int one=-1;
        int two=-1;
        int min=Integer.MAX_VALUE;
       for(int i=0;i<len;i++)
       {
           char ch=S.charAt(i);
           if(ch=='0')
           zero=i;
           if(ch=='1')
           one=i;
           if(ch=='2')
           two=i;
           if(zero>=0 && one>=0 && two>=0)
           {
               int minpos=-1,maxpos=-1;
              if(zero<=one && zero<=two)
              minpos=zero;
              else if(one<=two && one<=zero)
              minpos=one;
              else
              minpos=two;
              
               if(zero>=one && zero>=two)
              maxpos=zero;
              else if(one>=two && one>=zero)
              maxpos=one;
              else
              maxpos=two;
              
              int y=(Math.abs(maxpos-minpos))+1;
              
              min=Math.min(min,(y));
              
           }
           
           
       }
       if(min==Integer.MAX_VALUE)
       min=-1;
       return min;
    }
};