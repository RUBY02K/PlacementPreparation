class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int [][] dp = new int [n+1][sum+1];
      dp[n][0] = 1;
        for (int j = 1; j <= sum; j++) {
            dp[n][j] = 0;
        }
        for(int i = n-1 ; i >=0 ; i --){
            for(int j = 0 ; j <= sum ; j++){
            if(arr[i] > j){
            dp[i][j] = dp[i+1][j];
        }
        else {
        dp[i][j] = (dp[i+1][j-arr[i]] == 1) ||  (dp[i+1][j] == 1) ? 1 :0 ;
    
       }
        
    }
}
    return dp[0][sum] == 1 ;
}

}


