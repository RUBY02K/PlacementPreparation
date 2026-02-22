package exceptionhandling;

public class Exception {
 public static  void main (String[] args){
     int [] numerator = {12,34,56,30};
     int []denominator = {2,3,0,4};
     for (int i = 0; i< numerator.length; i++){
     System.out.println(divide(numerator[i], denominator[i]));
     }
     System.out.println("good job ");
    }
 private static int divide (int a , int b ){
     try{
         return a/b;
     }catch (ArithmeticException e){
         return -1;
     }


 }
}
