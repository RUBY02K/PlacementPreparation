class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int[] hash = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (hash[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }
}