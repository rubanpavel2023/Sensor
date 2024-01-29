package Sensor;

public class Main {
    public static void main(String[] args) {
        Substance substance = new Substance();
        new BinaryObserver(substance);
        substance.setState(-3);
        substance.setState(4);
        substance.setState(0);
    }

}
