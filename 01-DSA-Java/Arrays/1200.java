
public class 1200 {
    class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);   // Step 1: sort
        
        int minDiff = Integer.MAX_VALUE;
        
        // Step 2: find minimum difference
        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        
        // Step 3: collect pairs
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minDiff){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        
        return result;
    }
}

}
