class Solution {
    
    public List<Integer> swap(List<Integer> v,int a,int b){
        int t = v.get(a);
        v.set(a,v.get(b));
        v.set(b,t);
    
        return v;
        
    }
    public void permuteAll(List<Integer> v ,List<List<Integer>> r,int i){
        
        //[1,2,3],[],1
        if(i==v.size()-1){
            r.add(new ArrayList(v));
            return;            
        }
        
        for(int w =i;w<v.size();w++){//w=0 to 2          //w=0 to 2
            v= swap(v,i,w);//[1,2,3],0,0 ...//[1,2,3]      
            permuteAll(v,r,i+1);//[1,2,3],[],1   //[1,2,3],[],2  
            v= swap(v,w,i);////[1,2,3]
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> v= new ArrayList();
        List<List<Integer>>  r = new ArrayList();
        for(int i=0;i<nums.length;i++){
            v.add(nums[i]);//[1,2,3]
        }
        int i=0;
        permuteAll(v,r,i);//[1,2,3],[],0
        
        return r;
    }
}