// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            int numbers[]= new int[N];
            for(int i = 0; i < N; i++)
                numbers[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.countPairs(N, X, numbers); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
/**class Solution 
{ 
    long countPairs(int N, int X, int numbers[]) 
    { 
        String num = Integer.toString(X);
        long count =0;
        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                if(j!=i && num.equals(Integer.toString(numbers[i])+Integer.toString(numbers[j]))){
                    count++;
                }
            }
        }
        return count;
    }
} //(TLE)**/
class Solution 
{ 
   long countPairs(int n, int X, int numbers[]) 
   { 
       // code here
       String num=Integer.toString(X);
       long count=0;
       HashMap<String,Integer> map =new HashMap<>();
       for(int i :numbers)
       {
           map.put(Integer.toString(i),map.getOrDefault(Integer.toString(i),0)+1);
       }
       for(String str :map.keySet())
       {
           int freq=map.get(str);
           if(num.startsWith(str))
           {
               String rem=num.substring(str.length());
               if(map.containsKey(rem))
               {
                   if(str.equals(rem))
                       freq--;//as they are same
                   count+=(map.get(rem)*freq);//we have n*m ways to get num using rem and str
                       
               }
           }
       }
       return count;
   }
}