class Solution {
    class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public String reorganizeString(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                pq.add(new Pair((char) (i + 'a'), count[i]));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (pq.size() >= 2) {
            Pair p1 = pq.poll();
            Pair p2 = pq.poll();

            ans.append(p1.ch);
            ans.append(p2.ch);

            p1.freq--;
            p2.freq--;

            if (p1.freq > 0) pq.add(p1);
            if (p2.freq > 0) pq.add(p2);
        }

        if (!pq.isEmpty()) {
            Pair last = pq.poll();

            if (last.freq > 1) return "";

            ans.append(last.ch);
        }

        return ans.toString();
        System.out.println("this is greedy and heap pattern ");
    }
}