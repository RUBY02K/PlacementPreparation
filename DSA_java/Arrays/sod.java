package DSA_java.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public long[] distance(int[] nums) {
        long[]res = new long [nums.length];
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i ++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(int i = 0 ; i < nums.length;i++){
         ArrayList <Integer> list = map.get(nums[i]);
         long sum = 0 ;
         for(int j : list){
            sum+= Math.abs(i-j);
         }
         res[i] = sum;
        }
        return res ; 
    }
} {
    
}
