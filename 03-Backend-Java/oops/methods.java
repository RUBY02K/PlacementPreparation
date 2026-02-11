
public class methods {
   public static void main(String[] args) {
      boolean  y = is_prime(7);
     System.out.println(y);
   //  int x = 10; 
   //  System.out.println(multiply(x));
   //  System.out.println(x);
    
   //  int a1 = add(44,56);
   //  System.out.println(a1);

   //  String word = word(" ruby ");
   //  System.out.println(word);
   } 
   // public static int summ(int...a){
   //   int sum = 0;
   //   for (int i :a){
   //    sum +=i;
   //   }
   //   return sum;
   // }
   
   public static boolean is_prime (int num ){
      int cnt =0 ;
    for(int i = 1; i<num/2; i++){
      if (num % i == 0 ){
         cnt++;
      }
    }

      return cnt == 1;
   }

//  public static int add(int a , int b ){
//     return a+b;
//  }

//  public static String word(String str ){
//     return str.trim().toUpperCase();
//  }
//  public static int add (int a , int b  ,int c ){
//     return a+b+c;
//  }
//  public static int multiply(int x){
//     return x *10;
//  }

}
