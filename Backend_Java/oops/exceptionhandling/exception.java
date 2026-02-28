package exceptionhandling;

public class exception {
    public static void main(String[] args) {
      try{
          level1();

      }catch(java.lang.Exception e)
      {
          System.out.println("index out of bound ");
      }
    }
    public static void level3(){
        int [] array = new int[5];
        array[5] = 10;
    }

    public static  void level2(){
        level3();
    }

    public static  void level1(){
        level2();
    }
}
//        int[] numerator = {12, 34, 56, 30};
//        int[] denominator = {2, 3, 0, 4};
//        for (int i = 0; i < 10; i++) {
//            try{
//                System.out.println(divide(numerator[i], denominator[i]));
//
//            }catch (java.lang.Exception e ){
//                System.out.println(e);
//            }
//        }
//        System.out.println("good job :) ");
//    }
//
//    private static int divide(int a, int b) {
//        try {
//            return a / b;
//        }  catch (ArithmeticException e) {
//            System.out.println("arithimatic exception");
//            return -1;
//        } catch (java.lang.Exception e) {
//            System.out.println(e);
//            return -1;
//
//        }

