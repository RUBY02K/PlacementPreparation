package interfaces.animals;

public interface Animal {
    public  void eat();
    void sleep();
   public static final int maxage  = 2 ;

   public static void info(){
       System.out.println("static method hai that can have a body ");
   }
   default void run(){
       System.out.println("every animal runs fast ");
   }
}
