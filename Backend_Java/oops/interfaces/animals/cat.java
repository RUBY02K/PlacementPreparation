package interfaces.animals;

public class cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat drinks milk ");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeps ");
    }
}
