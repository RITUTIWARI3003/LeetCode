class Solution {
      public void printCombo(int[] arr,int i,int n,int k, int size,List<Integer> v,List<List<Integer>> res,int sum,int sz){
          
       if(size==k){
           if(sum==0){
           res.add(new ArrayList<>(v)); //[[1,2]]
           return;
           }
       }
        if(i==n) return;
          if(sz==9) return;
       
        v.add(arr[i]); //v[] -->[1,2] //[1,]
        printCombo(arr,i+1,n,k,size+1,v,res,sum-arr[i],sz+1); //(arr,2,4,2,2,v,res)
                   v.remove(v.size()-1); //--> v-->[1]
          printCombo(arr,i+1,n,k,size,v,res,sum,sz+1);//(arr,4,)
       // return r;
    }
    public List<List<Integer>> combinationSum3(int k, int n ) {
        int arr[] = new int[n];
        for(int  i = 0;i<n;i++){//
             arr[i]  = i+1; //1,2,3,4
        }
        int sz = 0;
       
        List<Integer> v = new ArrayList();
        int i=0;
        int size = 0;
        int sum = n;
        List<List<Integer>> res = new ArrayList<>();
            printCombo(arr,i,n,k,size,v,res,sum,sz); //(arr,0,4,k,0,v,res)
        return res;
    }
        
    
}