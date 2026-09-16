class Solution {
    public int longestSubarray(int[] nums) {

        int low = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int high = 0; high < nums.length; high++) {

            if (nums[high] == 0) {
                zeroCount++;
            }

            // More than one zero → shrink window
            while (zeroCount > 1) {
                if (nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }

            // Delete one element (the zero)
            ans = Math.max(ans, high - low);
        }

        return ans;
    }
}