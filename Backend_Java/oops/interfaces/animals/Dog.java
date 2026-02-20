package interfaces.animals;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("dog is eating biscuits  ");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping ");
    }

}
