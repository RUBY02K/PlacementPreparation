class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = wt.length; ; 
        int[][] dp = new int[n][W+1];
        for(int i = 0; i < n; i++){
         Arrays.fill(dp[i], -1);
      }
      return fun(0 , W ,n ,val,wt,dp );
    }
    public int fun(int  i , int W ,int n , int val[], int wt[] , int[][]dp){
        if(i == n )return 0;
         if(dp[i][W] != -1){
             return dp[i][W] ;
         }
        if(wt[i] > W)
        { return dp[i][W] = fun(i+1 , W ,n, val, wt , dp);}
        int yes = val[i] + fun(i+1 , W-wt[i] ,n, val, wt, dp);
        int no = fun(i+1 , W , n,val, wt,dp);
        return dp[i][W]= Math.max(yes , no);
        
    }
}
