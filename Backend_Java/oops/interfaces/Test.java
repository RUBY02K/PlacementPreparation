package interfaces;

import Animal.Dog;
import interfaces.devices.smartphone;
import interfaces.animals.cat;

public class Test {
     public static void main(String[]args) {
//       Dog dog = new Dog();
//       dog.eat();
//       dog.sleep();
//       cat cat = new cat();
//       cat.eat();
//       cat.sleep();
//         System.out.println(Animal.maxage);
//         System.out.println(
//                 Dog.maxage
//         );
//         Animal.info();
//         dog.run();
//         cat.run();
         smartphone mobile = new smartphone();
         mobile.clickimage();
         mobile.makecall("769779189");
         mobile.endcall();
         mobile.makevideo();
         mobile.playmusic();
         mobile.stopmusic();


    }
}
