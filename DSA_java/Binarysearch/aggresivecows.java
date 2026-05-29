class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1]-stalls[0];
        if(k>n){
        return -1; }
        int res = -1;
        while(low<=high ){
            int guess = low +(high - low)/2;
            if(cows(stalls , k , guess)){
                res = guess;
                low = guess+1;
            }
            else high = guess-1;
            
        }
        return res; 
        
    }
    Boolean cows(int []stalls, int k , int guess){
        int cows = 1; int prev = stalls[0];
        for(int i = 0 ; i<stalls.length; i ++){
            int distance = stalls[i]-prev;
            if (distance >= guess){
                cows++;
                prev = stalls[i];
            }
            
            if(cows>=k)
                return true ; 
        }
        return false ;
    }
}