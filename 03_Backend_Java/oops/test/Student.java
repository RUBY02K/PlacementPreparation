

public class Student {
    // properties  /fields/instance variable and behaviour
    String name;
    int rollnumber ;
   private  int age ; 
   public void setage(int age ){
    if (age <0){
        age = 0;
    }
    this.age = age ;
   }

}
