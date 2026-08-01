class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length; ; 
        int[][]dp = new int[n+1][W+1];
        for(int i = n-1; i>=0; i--){
            for(int j = 0 ; j<=W ; j++){
                if(wt[i]>j){
                    dp[i][j] = dp[i+1][j];
                }
                else 
                dp[i][j] = Math.max((val[i] + dp[i+1][j-wt[i]]) , (dp[i+1][j]));
            }
        }
      return dp[0][W]  ;
    
    }
}
