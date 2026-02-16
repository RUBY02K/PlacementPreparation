package DSA_java.bitmanipulation;

public class 190 {
    
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans = ans << 1; // left shift answr
            ans = ans | (n & 1); // add last bit of num
            n = n >> 1; // shift num right
        }

        return ans;
    }
}


