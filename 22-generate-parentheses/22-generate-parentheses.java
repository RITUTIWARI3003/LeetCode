class Solution {
  
    public static void part(char[] res,int l,int r,ArrayList<String> ans,int i,int n)

    {
        if(i == 2*n)  //if opening brace and closing brace is equal to 2*n 
                     // i.e, l+r = 2*n

        {
            ans.add(new String(res));
            return;
        }
        if(l == r)
        {
            res[i] = '('; // always add opening brace
            part(res,l+1,r,ans,i+1,n); // increase opening brace by 1
        }
        else if(l > r) // if opening no. of brace greater than closing there are 
                       // two cases
        {
            if( l == n) // case 1 : if l== n opening braces got exhausted 
                         // then add remaining closing brace 
            {
                res[i] = ')';
                part(res,l,r+1,ans,i+1,n); //increrase r by 1
            }
            else // if opening brace is not yet over then
            {
                res[i] = '('; // then 2 cases --> i) add opening 
                part(res,l+1,r,ans,i+1,n);
                res[i] = ')';  //and then add --> ii) add closing
                part(res,l,r+1,ans,i+1,n);
            }
        }
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        int i =0;
        int l =0;
        int r = 0;
        char[] res = new char[2*n];
        part(res,l,r,ans,i,n);
        return ans;
    }
}