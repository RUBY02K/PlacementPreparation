package oops.innerclasses;

public class Test {

    public static void main(String[] args) {
        innerclasses.car car = new innerclasses.car("tata safari");
        car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        computer computer = new computer ("hp", "ABC","xysz");
        computer.getOs().displayinfo();
    }
}
