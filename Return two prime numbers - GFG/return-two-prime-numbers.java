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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> primeDivision(int N){
        List<Integer> ans = new ArrayList<>(); // List to store prime numbers
        for(int i =2;i<=N/2;i++){ //reaching till half we can get our primes
            if(check(i) && check(N-i)){  //first prime from beggining and last prime from end 
                ans.add(i);  //adding in list
                ans.add(N-i); 
                return ans;
            }
        }
        return ans;//return the value
    }
    
    
    static boolean check(int n){ // checking for prime
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}