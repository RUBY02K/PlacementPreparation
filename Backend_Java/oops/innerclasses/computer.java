package innerclasses;

public class computer {
private String brand;
private String model;

    public OperatingSystem getOs() {
        return os;
    }

    private OperatingSystem os;

 static class USB{
 private String type ;

     public USB(String type) {
         this.type = type ;
     }
     public void displayinfo(){
         System.out.println("USB type "+type );
     }
 }

public computer(String brand,String model, String osName ){
    this.brand = brand;
    this.model = model;
    this.os = new OperatingSystem(osName);
}
class OperatingSystem{
    private String osName ;

    public OperatingSystem(String osName) {
        this.osName = osName;
    }
    public void displayinfo(){
        System.out.println("computer Model is "+model + "computer brand is "+brand + "os name "+osName);
    }
}
}
