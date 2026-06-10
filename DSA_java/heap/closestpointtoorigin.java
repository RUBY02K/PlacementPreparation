class Solution {
  
    class pair {
        int index;
        long distance;

        pair(int i, long d) {
            index = i;
            distance = d;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        int n = points.length;

        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, distance(points[i][0], points[i][1]));
        }

        PriorityQueue<pair> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(b.distance, a.distance) 
        ); // maxheap coz we wnat min distance ..

        for (int key : map.keySet()) {

            pq.add(new pair(key, map.get(key)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        int i = 0;

        while (!pq.isEmpty()) {

            pair p = pq.poll();

            ans[i][0] = points[p.index][0];
            ans[i][1] = points[p.index][1];

            i++;
        }

        return ans;
    }

    public long distance(int x, int y) {
        return 1L * x * x + 1L * y * y;
    }
}