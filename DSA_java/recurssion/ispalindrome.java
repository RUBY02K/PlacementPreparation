import java.util.Scanner;
public class ispalindrome{
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int low = 0 ;
        int high = s.length()-1;
       boolean ans =  fun(s , low , high);
       System.out.println(ans);
    }
    public static  boolean fun (String s , int low , int high){
        int len = high-low+1;
        if(len == 0 || len==1){
            return true ;
        }
        if(s.charAt(low)!= s.charAt(high))
        {
    return false ;
        }
        return fun( s , low+1 , high-1); }

}
