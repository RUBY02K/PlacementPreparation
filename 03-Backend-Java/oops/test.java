class test  {
    public static void main(String[] args) {
        Car suv = new Car();
        suv.setSpeed(1000);
        int speed1= suv.getSpeed();
        suv.accelerate (speed1);
        suv.brake(speed1);
        System.out.println(speed1);
        suv.makesound();
  //------------------------
        honda suzuki = new honda();
        suzuki.setSpeed(500);
        int speed2 = suzuki.getSpeed();
        suzuki.accelerate(speed2);
        suzuki.brake(speed2);
        System.out.println(speed2);
        suzuki.makesound();

//------------------polymorphism 
          Car newhonda = new honda();
           suzuki.makesound();
        }    
           
    }

