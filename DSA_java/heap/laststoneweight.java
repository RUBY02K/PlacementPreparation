class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        PriorityQueue<pair> pq = new PriorityQueue<>(
            (a, b) -> b.num - a.num
        );

        for (int i = 0; i < n; i++) {
            pq.add(new pair(i, stones[i]));
        }

        while (pq.size() > 1) {

            pair x = pq.poll();
            pair y = pq.poll();

            int smash = x.num - y.num;

            if (smash > 0) {
                pq.add(new pair(x.index, smash));
            }
        }

        return pq.isEmpty() ? 0 : pq.poll().num;
    }

    class pair {
        int index;
        int num;

        pair(int i, int n) {
            this.index = i;
            this.num = n;
        }
    }
}