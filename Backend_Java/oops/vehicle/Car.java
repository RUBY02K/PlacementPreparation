package vehicle;

class Car{
    
     String color ;
    private String brand  ;
    private String model ;
    int speed ;
     private int  year;

  public void accelerate (int increment ){
    speed+=increment;
 }
 public void brake (int decrement){
     speed -=decrement ;

 }
 public void makesound(){
     System.out.println("zooom");
 }
     public String getColor() {
         return color;}

     public void setColor(String color) {
         this.color = color;
     }

     public String getBrand() {
         return brand;
     }

   

     public String getModel() {
         return model;
     }


     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public int getYear() {
         return year;
     }

     public void setYear(int year) {
         this.year = year;
     }


 }