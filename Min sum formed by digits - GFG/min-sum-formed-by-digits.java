// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java
//length of two numbers should be almost same 
// because lets say if in aan array {6, 8, 4, 5, 2, 3} 68 + 4523 == 4 digit or 5 digit no.
// but 684 + 523 == 3 or 4 digit no which is min no. of digits in all case
// sort this array first
// for first number take every alternate number and form digit from index 1 until u teach the end
//for second take every alternate digit from index 1 until u teach the end

class Solution {
    
    public static long minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        if(arr.length == 1) return arr[0];
       long num1 = arr[0];
       long num2 = arr[1];
       for(int i = 2 ;i<arr.length;i++){
           if(i%2==0){
               num1 = num1*10 + arr[i];
           }
           else 
           {num2 = num2*10 + arr[i];
           }
       }
       return num1+num2;
    }
}