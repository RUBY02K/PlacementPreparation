class Solution {

    class pair {
        String first;
        int second;

        pair(String f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int n = wordList.size();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(wordList.get(i), 1);
        }

        if (!map.containsKey(beginWord)) {
            map.put(beginWord, 1);
        }

        if (!map.containsKey(endWord))
            return 0;

        Queue<pair> q = new LinkedList<>();

        q.offer(new pair(beginWord, 1));
        map.remove(beginWord);

        while (!q.isEmpty()) {

            pair p = q.poll();

            String s = p.first;
            int val = p.second;

            if (s.equals(endWord))
                return val;

            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length; i++) {

                char original = arr[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    if (ch == original)
                        continue;

                    arr[i] = ch;

                    String next = new String(arr);

                    if (map.containsKey(next)) {
                        q.offer(new pair(next, val + 1));
                        map.remove(next);
                    }
                }

                arr[i] = original;
            }
        }

        return 0;
    }
}