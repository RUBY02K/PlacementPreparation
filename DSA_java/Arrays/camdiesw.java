class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int greatest = candies[0];
        for (int i = 1; i < candies.length; i++) {
            greatest = Math.max(greatest, candies[i]);
        }

        for(int  i = 0 ; i < candies.length ; i++){
         int sum = candies[i]+extraCandies;
         if(sum >= greatest){
            list.add(true);
         }
         else list.add(false);
        }
        return list;
    }
}
