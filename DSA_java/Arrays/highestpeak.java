class Solution {
    public int largestAltitude(int[] gain) {
       int n = gain.length;
       int sum = 0 ; 
        int max = sum ;  
        for (int i = 0 ; i<n; i ++){
            sum += gain[i];
            max = Math.max(sum , max);
        }
       return max ;  
    }
}