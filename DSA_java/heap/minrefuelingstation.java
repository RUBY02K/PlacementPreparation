class Solution {
    class pair {
        int position ; 
        int fuel ; 
        pair (int p ,int f ){
            this.position = p; 
            this.fuel = f;
        }
    }
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        int stop = 0 ; 
        int idx = 0 ; 
        PriorityQueue <pair> pq = new PriorityQueue<>(
            (a,b) -> b.fuel - a.fuel
        );
          
        while (startFuel < target ){
            while( idx < n && stations[idx][0] <= startFuel  ){
                pq.add(new pair (stations[idx][0] ,stations[idx][1]));
                idx++;
            }
            if(pq.isEmpty()){
                return -1 ; 
            }
            pair curr = pq.poll();
            startFuel += curr.fuel;
            stop++;
        }
        return stop ; 
    }
}