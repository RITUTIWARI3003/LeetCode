class Solution {
   
    public void printCombo(int[] arr,int i,int n,int k, int size,List<Integer> v,List<List<Integer>> res){
       if(size==k){
           res.add(new ArrayList<>(v)); //[[1,2]]
           return;
       }
        if(i==n) return;
       
        v.add(arr[i]); //v[] -->[1,2] //[1,]
        printCombo(arr,i+1,n,k,size+1,v,res); //(arr,2,4,2,2,v,res)
                   v.remove(v.size()-1); //--> v-->[1]
          printCombo(arr,i+1,n,k,size,v,res);//(arr,4,)
       // return r;
    }
   
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int  i = 0;i<n;i++){//
             arr[i]  = i+1; //1,2,3,4
        }
       
        List<Integer> v = new ArrayList();
        int i=0;
        int size = 0;
        List<List<Integer>> res = new ArrayList<>();
            printCombo(arr,i,n,k,size,v,res); //(arr,0,4,k,0,v,res)
        return res;
    }
}