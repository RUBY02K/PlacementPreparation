package test;

import Animal.Dog;
import Animal.animal;
import Animal.cat;
import human.child;
import human.parent;

public class test {
    public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.setAge(3);
//         dog.setName("bob");
//         dog.getName();
//         dog.getAge();
//         animal animal = new animal();
//         animal.sayhello();
//         dog.sayhello();
//        cat cat = new cat(); // animal example of herarical inheritance
//        cat.sayhello();
//         human example of multilevel
//         child child = new child();
//         child.childmethodcalled();
//         child.setName("ram");
//         child.setAge(6);
//        System.out.println(child.hasSuperPowers);

//         parent parent = new parent();
//         parent.setAge(40);
//         parent.setName("mukesh");
        animal myanimal = new animal();
        myanimal.sayhello();

        animal dog = new Dog();
        dog.sayhello();

        animal cat = new cat();
        cat.sayhello();


    }
}
