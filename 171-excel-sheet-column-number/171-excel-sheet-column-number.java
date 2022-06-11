class Solution {
    public int titleToNumber(String columnTitle) {
         
        int res=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char ch=columnTitle.charAt(columnTitle.length()-i-1); 
            int val=(int)(Math.pow(26,i)); 
            res+=val*((ch-65)+1);  
        }
        return res;
        
    }
}