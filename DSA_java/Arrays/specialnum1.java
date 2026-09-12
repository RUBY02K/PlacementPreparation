class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0 ; 
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.computeIfAbsent(nums[i] , x -> new ArrayList<>()).add(i);
            
        }
        for(ArrayList<Integer> list: map.values()){
            if(list.size()==3)
            {
                int i = list.get(0);
                int j = list.get(1);
                int k = list.get(2);
                if(j-i == k-j){
                    count++;
                }
            }     
        }
        return count ; 
    }
}