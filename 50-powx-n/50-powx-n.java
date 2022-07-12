class Solution {
   
    public double facNum(double x,int n,int k){
        if(k==0)
            return 1;
       double p =  facNum(x,n,k/2);
       if(k%2==0)  //if power is even it completely divides in two parts
           return p*p;
        return p*p*x; //if it is odd we are left with one x 
       
    }
   
   
    public double myPow(double x, int n) {
        if(n<0){ //In case if Number is negative
            x=1/x;  // make x its reciprocal
            n*=-1;  // and then make n positive
        }
       
        int k=n;
        double v = facNum(x,n,k);
        return v;
       
    }
}