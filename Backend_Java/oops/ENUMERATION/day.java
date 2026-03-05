package ENUMERATION;

public enum day {
    SUNDAY("sunday") ,
    MONDAY("monday") ,
    TUESDAY("tuesday") ,
    WEDNESDAY("wednesday") ,
    THURSDAY("thursday") ,
    FRIDAY("friday") ,
    SATURDAY("saturday") ;

    public String getLower() {
        return lower;
    }

    private String lower ;

   private  day(String lower ) {
       System.out.println("our constructor called ");
        this.lower = lower ;
   }

    public void  display(){
        System.out.println("today is "+ this.name());
    }
}

