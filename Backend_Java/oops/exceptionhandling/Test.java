package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;


public class Test {
     public static void main(String[] args) throws IOException {
         method2();
         System.out.println("hello ");

    }
     public  static void method2() {
         method1();
     }
public static void method1 ()  {
         try{
             FileReader fileReader = new FileReader("a.txt");
         }
         catch (Exception e ){
             System.out.println("file not found exception");
             throw new RuntimeException("oops");

         }




}
}
