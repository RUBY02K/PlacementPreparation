import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length()-1;
      StringBuilder ans = new StringBuilder();
        reverse(s,len , ans );
        System.out.println(ans);
    }
   public  static StringBuilder reverse (String s , int len ,  StringBuilder ans  ){
     if(len < 0 ){
       return ans;
     }
   ans.append(s.charAt(len));
   reverse( s , len-1 , ans );
return ans ;
   }
    
}
