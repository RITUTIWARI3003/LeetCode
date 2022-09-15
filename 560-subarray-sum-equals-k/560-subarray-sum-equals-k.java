class Solution {
    public int subarraySum(int[] srr, int x) {
           HashMap<Integer,Integer> m = new HashMap<>();
	    int pSum = 0;
	    int count  =0;
	    m.put(pSum,1);
	    for(int i =0 ;i<srr.length;i++){
	        pSum = pSum + srr[i];
	        if(m.containsKey(pSum-x)) count += m.get(pSum-x);
	       m.put(pSum,m.getOrDefault(pSum,0)+1);
	    }
	    return count;
    
        
    }
}