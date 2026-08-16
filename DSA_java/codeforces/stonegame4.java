class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];

        for (int x : stones) {
            cnt[x % 3]++;
        }

        // Either remainder 1 or remainder 2 is absent
        if (cnt[1] == 0 || cnt[2] == 0) {
            return Math.max(cnt[1], cnt[2]) > 2 && cnt[0] % 2 == 1;
        }

        // Both 1 and 2 are present
        return Math.abs(cnt[1] - cnt[2]) > 2 || cnt[0] % 2 == 0;
    }
}