class Solution {
    static boolean equalPartition(int arr[]) {

        int n = arr.length;

        int sum = 0;
        for (int x : arr)
            sum += x;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;

        int[][] dp = new int[n + 1][target + 1];

        dp[n][0] = 1;
        for (int j = 1; j <= target; j++)
            dp[n][j] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= target; j++) {

                int notTake = dp[i + 1][j];
                int take = 0;

                if (arr[i] <= j)
                    take = dp[i + 1][j - arr[i]];

                dp[i][j] = (take == 1 || notTake == 1) ? 1 : 0;
            }
        }

        return dp[0][target] == 1;
    }
}

