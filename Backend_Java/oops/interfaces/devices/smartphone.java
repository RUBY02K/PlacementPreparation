package interfaces.devices;

public class smartphone implements musicplayer,camera, phone{
    @Override
    public void clickimage() {
        System.out.println("saycheese");
    }

    @Override
    public void makevideo() {
        System.out.println("ligjts camera action ");
    }

    @Override
    public void playmusic() {
        System.out.println("playing song ");

    }

    @Override
    public void stopmusic() {
        System.out.println("stopping music ");

    }

    @Override
    public void makecall(String number) {
        System.out.println("making call to "+ number );

    }

    @Override
    public void endcall() {
        System.out.println("ending call ");
    }
}
