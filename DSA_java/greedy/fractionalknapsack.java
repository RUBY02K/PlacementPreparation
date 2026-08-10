class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        // ratio, value, weight
        double[][] items = new double[n][3];

        for (int i = 0; i < n; i++) {
            items[i][0] = (double) val[i] / wt[i];
            items[i][1] = val[i];
            items[i][2] = wt[i];
        }

        // Highest ratio first
        Arrays.sort(items, (a, b) -> Double.compare(b[0], a[0]));

        double ans = 0;

        for (int i = 0; i < n; i++) {

            if (items[i][2] <= capacity) {
                // Full item
                ans += items[i][1];
                capacity -= items[i][2];
            } 
            else {
                // Fraction of item
                ans += items[i][0] * capacity;
                break;
            }
        }

        return ans;
    }
}