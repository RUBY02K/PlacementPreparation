import java.util.HashMap;

public class fibonacci {
   static  HashMap<Integer , Integer> dp = new HashMap<>();
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(fun(n));
        
    }
    public static  int  fun(int n ){
            if (n == 0 || n==1){
                return n;
            }
            if(dp.containsKey(n)){
                return dp.get(n);
            }
            int a1 = fun(n-1);
            int a2 = fun(n-2);
            int ans = a1 + a2;
            dp.put(n , ans);
            return ans;
        }
    
}
