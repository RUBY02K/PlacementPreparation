class Solution {
    public int[] separateDigits(int[] nums) {

        int count = 0;

        for (int num : nums) {
            while (num > 0) {
                count++;
                num /= 10;
            }
        }

        int[] ans = new int[count];
        int index = count - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            while (num > 0) {
                ans[index--] = num % 10;
                num /= 10;
            }
        }

        return ans;
    }
}