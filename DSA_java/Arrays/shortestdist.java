class Solution {
    public int minimumDistance(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }

            ArrayList<Integer> list = map.get(num);

            // Agar ye number pehle 2 baar aa chuka hai
            if (list.size() >= 2) {

                int first = list.get(0);

                int distance = 2 * (i - first);

                ans = Math.min(ans, distance);
                list.remove(0);
            }

            list.add(i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}