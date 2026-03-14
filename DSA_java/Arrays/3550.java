public class solution {
     public static int  main(String[]args ) {
         int[] nums  = {22, 45, 6,3};
        for(int i =0 ; i < nums.length  ; i++){
            if (nums[digitsum(i)] == i ){
                return i ;
            }
        }
        return -1;
    }
    public  static int digitsum (int num ){
         int sum = 0 ;
         while (num >0){
             sum = sum + num %10;
             num = num /10;
         }
         return sum ;
    }
}
