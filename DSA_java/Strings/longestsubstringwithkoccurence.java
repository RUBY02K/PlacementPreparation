class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int res = 0;
        int low = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // agar kisi character ki frequency 2 se zyada ho gayi
            while (map.get(ch) > 2) {
                char left = s.charAt(low);

                map.put(left, map.get(left) - 1);
                low++;
            }

            // current valid window
            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}