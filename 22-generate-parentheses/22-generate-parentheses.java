class Solution {
    
    void parMeter(int n,int l,int r,int i,String s,List<String> le){
        //3,0,0,0,"",[""]
        if(i==2*n){
            le.add(s);
            return;
        }
        if(l==r){
           // s=s+"(";//"("
            parMeter(n,l+1,r,i+1,s+"(",le);//3,1,0,1,"()",[]
        }
        else if(l>r){ 
            if(l==n){
            //s=s+")";
            parMeter(n,l,r+1,i+1,s+")",le); //(3,3,1,4,(((),3,3,2,5 ((()),3,3,3,6,((()))
            }
        
        else {
           // s=s+"(";
            parMeter(n,l+1,r,i+1,s+"(",le);//3,2,0,2,"((" ,3,3,0,3 , "((("
          //  s=s+")";
            parMeter(n,l,r+1,i+1,s+")",le);//3,1,1,3,(()
        }
        }
    }
    
    public List<String> generateParenthesis(int n) {
        String s = "";
        List<String> le = new ArrayList();
        int l=0,r=0,i=0;
        parMeter(n,l,r,i,s,le);//3,0,0,0,"",[""]
        return le;
    }
}