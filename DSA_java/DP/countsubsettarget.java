class Solution {
    static int perfectSum(int[] arr, int target) {
    int n = arr.length;
    int [][] dp = new int [n+1][target+1];
    dp[n][0] = 1 ; 
    for(int j = 1 ; j <= target ; j++){
        dp[n][j] = 0 ;
    }
     for(int i = n-1 ; i>=0 ; i--){
        for(int j = 0 ; j <= target ; j++){
            dp[i][j] = dp[i + 1][j];
                if (arr[i] <= j) {
                    dp[i][j] += dp[i + 1][j - arr[i]];
                }
        }
    }
      return dp[0][target];
    }
}