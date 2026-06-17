import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        // pair: [capital, profit]
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        // sort by capital
        Arrays.sort(projects, (a, b) -> a[0] - b[0]);

        // max heap for profits
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        int i = 0;

        for (int j = 0; j < k; j++) {
            
            // add all projects we can afford
            while (i < n && projects[i][0] <= w) {
                maxHeap.add(projects[i][1]);
                i++;
            }

            // no project available
            if (maxHeap.isEmpty()) break;

            // pick max profit
            w += maxHeap.poll();
        }

        return w;
    }
}