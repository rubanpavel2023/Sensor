package Sensor;

public class BinaryObserver extends Observer {
    public BinaryObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Temperature: " +substance.getState());
        System.out.println("Color: " + substance.getColor());
        System.out.println("Weight: " + substance.getWeight());
    }
}
