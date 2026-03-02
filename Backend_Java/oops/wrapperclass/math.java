package wrapperclass;

public class math {
   public static void main(String[] args) {
 int a = 20 ; int b = 59 ;
       int max = Math.max(a, b);
       int min = Math.min(a, b);
       int c = -11;
       Math.abs(c);
       double d = 1.12;
       double ceil = Math.ceil(d);
       System.out.println(ceil);
       System.out.println(Math.floor(d)); // koi number agr 1.12 hai toh uska floor hua 1.0 , ceil hua 2.0 /
       System.out.println(Math.round(d));

       int e = 144 ;
       System.out.println(Math.sqrt(e));
       System.out.println(Math.pow(12 , 3));

       System.out.println(Math.log10(10));

       System.out.println("sin 90 is : "+ Math.sin(90));
       System.out.println((int)(Math.random() * 11)); // any rando number between 0 to 11;

       System.out.println(Math.nextAfter(1, 3 ));


   }


}
