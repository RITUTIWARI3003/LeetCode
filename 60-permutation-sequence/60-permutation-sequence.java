class Solution {
    public int[] rightRotate(int []arr,int x,int y){
        int last = arr[y];
        for(int i=y;i>x;i--){
            arr[i]=arr[i-1];
        }
        arr[x]=last;
        return arr;
    }
    public int[] leftRotate(int []arr,int x,int y){
        int first = arr[x];
        for(int i=x;i<y;i++){
            arr[i]=arr[i+1];
        }
        arr[y]=first;
        return arr;
    }
   
    public void permuteAll(int[] arr,int k,int i,int[] x,tmp p){
        
        // String v="";
        if(i == arr.length-1){
            p.count++;
        
        if(p.count==k){
            for(int  m = 0;m<arr.length;m++){
                x[m] = arr[m];
            }
            //[1,2,3]->x[0] = 1
            // int[] p = arr;
            // for(int l=0;i<arr.length;l++){
            //     int c = arr[l];
            //     v+=Integer.toString(c);
             return;
            }
            return;
        }
//         if(i==arr.length){
//             count+=1;
//         }
           
        for(int j=i;j<arr.length;j++){
            arr= rightRotate(arr,i,j);
            // count+=1;
            permuteAll(arr,k,i+1,x,p);
            arr= leftRotate(arr,i,j);
        }
     
    }
    public String getPermutation(int n, int k) {
        int [] arr = new int[n];
        int []x = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int i=0;
        tmp p = new tmp();
        permuteAll(arr,k,i,x,p);
        int num = 0;
        for(int s=0;s<arr.length;s++){
            num = num * 10 + x[s];
           
        }
        String val =  Integer.toString(num);
        return val;
    }
}

class tmp{
    int count = 0;
}

//[3,2,1] -->[321] --> string 
