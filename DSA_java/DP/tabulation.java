class Solution {
    public int climbStairs(int n) {
        int ans = 0 ;
        int step0 = 0 ; int step1 = 1;
        for(int i = 0 ; i < n ; i ++)
        {   
             ans = step0+step1;
            step0 = step1;
            step1 = ans ;
        }
        return ans ;
    }
}