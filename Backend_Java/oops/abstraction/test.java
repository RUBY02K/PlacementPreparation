package abstraction;

public class test {
    public static void main(String[] args) {
        animal animal = new animal(); // abstract class ka constructor cannnot be initialised or made
        animal dog = new dog();
        animal cat = new cat ();
        cat.sayhello();
        dog.sayhello();
    }
}
