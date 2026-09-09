class Solution {
    public long countCommas(long n) {
       long comma = 0 ; 
        long start = 1000; 
        int commacount = 1; 
        while (start<= n ){
            long end = start * 1000-1; 
            long count = Math.min(n , end )- start +1; 
            comma += count*commacount ; 
            start*= 1000; 
            commacount ++;
        }
        return comma ; 
    }
}