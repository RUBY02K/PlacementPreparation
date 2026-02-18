package human;
public class grandparent {
    public grandparent(){
        hasSuperPowers = true ;
        System.out.println("grand parent constructor called ");
    }
   public  boolean hasSuperPowers ;

    public boolean HasSuperPowers() {
        return hasSuperPowers;
    }

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int  age ;

    public int  getAge() {
        return age;
    }

    public void setAge(int  age) {
        this.age = age;
    }
}
