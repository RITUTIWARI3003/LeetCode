// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution { 
static void toi( int n, int t1, int t2, int t3, ArrayList<Integer> al) { 
    if( n == 0 ) return ;   
    toi(n-1,t1,t3,t2,al) ;
    al.add(t1) ; al.add(t3) ;
    toi(n-1,t2,t1,t3,al) ; 
}
static List <Integer> shiftPile (int N, int n){ 
  ArrayList<Integer>al = new ArrayList<>();  
  toi( N , 1 , 2 , 3 , al );  
  return Arrays.asList(al.get(n*2-2),al.get(n*2-1)) ;
   }
}