class Solution {
    public long[] distance(int[] nums) {
        long[]res = new long [nums.length];
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i ++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (ArrayList<Integer> list : map.values()) {

            int m = list.size();

            // Prefix sum of indices
            long[] prefix = new long[m];

            prefix[0] = list.get(0);

            for (int i = 1; i < m; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            for (int i = 0; i < m; i++) {

                long left = 0;
                long right = 0;

                // Left contribution
                if (i > 0) {
                    long leftSum = prefix[i - 1];
                    left = (long) list.get(i) * i - leftSum;
                }

                // Right contribution
                if (i < m - 1) {
                    long rightSum = prefix[m - 1] - prefix[i];
                    long count = m - i - 1;

                    right = rightSum - (long) list.get(i) * count;
                }

                res[list.get(i)] = left + right;
            }
        }
        return res ; 
    }
}