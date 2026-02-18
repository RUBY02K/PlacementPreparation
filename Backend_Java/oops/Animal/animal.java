package Animal;
public class animal {
  private  String name ; 
  private  int age ; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 public void eats (){
    System.out.println("this animal eats food ");
 }

 public void sayhello(){
    System.out.println("any sound babyyy ");
 }
}
