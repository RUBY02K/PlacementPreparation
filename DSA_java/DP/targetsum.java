class Solution {
    public int totalWays(int[] arr, int target) {

        int n = arr.length;
        int total = 0;

        for (int x : arr)
            total += x;

        if (Math.abs(target) > total || (total + target) % 2 != 0)
            return 0;

        int sum = (total + target) / 2;

        int[][] dp = new int[n + 1][sum + 1];

        dp[n][0] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= sum; j++) {

                int notTaken = dp[i + 1][j];

                int taken = 0;
                if (arr[i] <= j)
                    taken = dp[i + 1][j - arr[i]];

                dp[i][j] = taken + notTaken;
            }
        }

        return dp[0][sum];
    }
}