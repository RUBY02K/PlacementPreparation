package exceptionhandling;


import accessmodifiers.test.Student;

public class Exception {
    public static void main(String[] args) {
        int[] numerator = {12, 34, 56, 30};
        int[] denominator = {2, 3, 0, 4};
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println(divide(numerator[i], denominator[i]));

            }catch (java.lang.Exception e ){
                System.out.println(e);
            }
        }
        System.out.println("good job :) ");
    }

    private static int divide(int a, int b) {
        try {
            return a / b;
        }  catch (ArithmeticException e) {
            System.out.println("arithimatic exception");
            return -1;
        } catch (java.lang.Exception e) {
            System.out.println(e);
            return -1;

        }
    }
}
