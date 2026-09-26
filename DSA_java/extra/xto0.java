1658. Minimum Operations to Reduce X to Zero
class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0 ; 
        for(int num : nums){
            total+= num;
        }
        int target = total - x;
        if(target == 0){
            return nums.length ;
        }
        int low = 0 ; 
        int sum = 0 ;
        int len = -1 ;
        for(int high = 0 ; high < nums.length ; high++ ){
            sum += nums[high];

            while(sum > target && low <= high){
                sum-=nums[low];
                low++;
            }
            if(sum == target ){
                len = Math.max(len , high - low+1);
            }
        }
       if(len == -1 ){
        return -1 ;
       }
       else return nums.length - len ;
    }
}