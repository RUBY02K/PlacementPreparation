class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        // impossible case
        if ((long)m * k > n) {
            return -1;
        }

        int low = bloomDay[0];
        int high = bloomDay[0];

        // min and max find
        for (int i = 1; i < n; i++) {

            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        int res = -1;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            int bouquets = canMake(bloomDay, k, guess);

            // enough bouquets possible
            if (bouquets >= m) {

                res = guess;
                high = guess - 1;
            }

            // not enough bouquets
            else {
                low = guess + 1;
            }
        }

        return res;
    }

    public int canMake(int[] bloomDay, int k, int days) {

        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            // flower bloomed
            if (bloomDay[i] <= days) {

                count++;

                // bouquet ready
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            }

            // break adjacency
            else {
                count = 0;
            }
        }

        return bouquets;
    }
}