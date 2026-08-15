class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0 ;
        int n = nums.length; 
        boolean nonzero = false ;
       for(int i = 0 ; i < n ; i++){
         
          if(nums[i]!= 0 ){
            nonzero = true ;
        }
         xor ^= nums[i] ;
       }
       if(!nonzero) {return 0;}
       if(xor!= 0) {return n ;}
       return n-1 ;
    }
}
