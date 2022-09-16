class Solution {
    public int longestConsecutive(int[] arr) {
         HashMap<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(m.containsKey(arr[i])){
                continue;
            }
            int leftStreak = 0,rightStreak=0;
            if(m.containsKey(arr[i]-1))
             leftStreak = m.get(arr[i]-1);
             if(m.containsKey(arr[i]+1))
             rightStreak = m.get(arr[i] + 1 );
            
            m.put(arr[i],(1+leftStreak+rightStreak));
            ans = Math.max(ans,m.get(arr[i]));
            
            m.put(arr[i]-leftStreak,m.get(arr[i]));
            m.put(arr[i]+rightStreak,m.get(arr[i]));
            
        }
        return ans;
        
    }
}