class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long[] suffixproduct = new long [ n+1];
        suffixproduct[n]=1;
        long LIMIT = (long)1e15;
        for (int i = n-1 ; i >=0; i --){
            suffixproduct[i] = suffixproduct[i+1]*nums[i];
            if(suffixproduct[i] > LIMIT){
                suffixproduct[i] = LIMIT;
            }
        }
        long prefixsum = 0 ;
        for (int i = 0 ; i< n ; i++){
            long rightproduct = suffixproduct[i+1];
            if (prefixsum  == rightproduct){
                return i ;
            }
            prefixsum += nums[i];
        }
        return -1;

    }
}