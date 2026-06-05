class Solution {
    public int findKthNumber(int m, int n, int k) {
         int low = 1;
        int high = m*n;
        int res = -1;
        while (low <= high ){
        int guess = low +(high - low )/2;
        if(count(m , n , guess)>=k){
            res = guess; 
            high = guess-1;
        }
        else low = guess+1;
        }
        return res ;
    }
    public int count(int m , int n , int guess ){
       int row = m ; int col = 1; 
       int count = 0 ;
       while (row > 0 && col <= n ){
        if((row*col) <= guess){
            count += row;
            col++;
        }
        else row --;
       }
       return count ; 
    }
}