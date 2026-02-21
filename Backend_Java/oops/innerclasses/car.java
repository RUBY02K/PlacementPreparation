package innerclasses;

public class car {
    private String model;
    private boolean isEngineOn;

    public car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {
        void start() {
            if (isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started ");
            } else {
                System.out.println(model + "engine already started ");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + "engine stopped ");
            } else {
                System.out.println(model + "engine already off ");
            }
        }
    }
}
