package Sensor;

public class Main {
    public static void main(String[] args) {
        Substance substance = new Substance();
        new BinaryObserver(substance);
        System.out.println("First state change :-3");
        substance.setState(-3);

        System.out.println("\nSecond state change: +4");
        substance.setState(4);
    }
}
