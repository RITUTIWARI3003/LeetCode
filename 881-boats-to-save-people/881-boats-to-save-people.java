class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0 ;
         Arrays.sort(people);
        int low = 0;
        int high = people.length-1;
        while(low <= high){
            if(people[low]+people[high]<=limit){
                low++;
            }
            high--;
            count++;
        }
        return count;
        
    }
}