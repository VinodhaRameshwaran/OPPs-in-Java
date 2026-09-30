abstract class Appliance {

    String name;

    Appliance(String name) {
        this.name = name;
    }

    abstract void displayAppliance();
}

interface RemoteControl {

    void turnOn();

    void turnOff();
}

class SmartTV extends Appliance implements RemoteControl {

    boolean status;

    SmartTV(String name) {
        super(name);
        status = false;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println("Smart TV is turned OFF");
    }

    @Override
    void displayAppliance() {
        System.out.println("Appliance Name: " + name);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

public class Main4 {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV("Samsung Smart TV");

        System.out.println("Appliance Details");
        tv.displayAppliance();

        System.out.println();

        tv.turnOn();
        tv.displayAppliance();

        System.out.println();

        tv.turnOff();
        tv.displayAppliance();
    }
}