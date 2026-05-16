package DSA_java.Binarysearch;


// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int result = -1;
        int low = 0 ; 
        int high = n-1;
        while(low <= high ){ 
        int ceil = low + (high - low )/2;
        if(arr[ceil]<x ){
            low = ceil+1;
        }
        else{
            result = ceil;
            high = ceil-1;
        }
         
        }
         return result; 
    }
}
