class MinStack {
    
    class Pair{
        int i;
        int j;
        
        Pair(int i ,int j){
            this.i = i;
            this.j = j;
        }
    }
    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();
        
    }
    
    public void push(int val) {
        if(s.empty()){
            s.push(new Pair(val,val));
        }else{
            int min = s.peek().j;
            if(min > val)
                min = val;
                s.push(new Pair(val,min));
            
        }
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
       return s.peek().i;
        
         
        
    }
    
    public int getMin() {
        return s.peek().j;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */