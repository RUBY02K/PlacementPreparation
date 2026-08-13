for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find characters whose frequency is less than k
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.get(ch) < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);

                maxlen = Math.max(left, right);

                return maxlen;
            }
        }
