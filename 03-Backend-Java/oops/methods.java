
public class methods {
   public static void main(String[] args) {
    int x = 10; 
    System.out.println(multiply(x));
    System.out.println(x);
    
    int a1 = add(44,56);
    System.out.println(a1);

    String word = word("    ruby   ");
    System.out.println(word);
   }  
 public static int add(int a , int b ){
    return a+b;
 }

 public static String word(String str ){
    return str.trim().toUpperCase();
 }
 public static int add (int a , int b  ,int c ){
    return a+b+c;
 }
 public static int multiply(int x){
    return x *10;
 }

}
