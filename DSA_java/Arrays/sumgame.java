class Solution {
    public boolean sumGame(String num) {

        int n = num.length();

        int diff = 0;
        int leftQ = 0;
        int rightQ = 0;

        // First half
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                diff += num.charAt(i) - '0';
            }
        }

        // Second half
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                diff -= num.charAt(i) - '0';
            }
        }

        return 2 * diff != 9 * (rightQ - leftQ);
    }
}