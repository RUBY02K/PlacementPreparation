class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0 ; 
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.computeIfAbsent(nums[i] , x -> new ArrayList<>()).add(i);
        }
        for(ArrayList<Integer>list : map.values()){
            if(list.size()< 3) continue ;
             int gap = list.get(1)- list.get(0);
            Boolean special = true ;
                for(int i = 2 ; i < list.size() ; i++){
                 if(list.get(i) - list.get(i-1) != gap){
                     special = false ;
                     break;
                 }
                }
            if(special)
             count++;
            }
        
        return count ; 
    }
}
