class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length ; 
        int five = 0 ;
        int ten = 0 ; 
        for(int i = 0 ; i < n ; i++){
            int money = bills[i];
            if(money == 5 ){
                five++;

            }
            else if (money == 10 ){
                if(five == 0){
                    return false ;
                }
                five --;
                ten++;
            }
            else {
                if(ten > 0 && five >0){
                    ten--;
                    five--;}
               else if(five >=3 ){
                  five = five-3;
                }
              else return false ;
            }
        }
        return true ;
    }
}