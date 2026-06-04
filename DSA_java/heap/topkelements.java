class Solution {

    class Pair {
        int first;
        int second;

        Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.second != b.second) {
                    return b.second - a.second; // higher frequency first
                }
                return a.first - b.first;
            }
        );

        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().first;
        }

        return ans;
    }
}