package Sensor;

import java.util.concurrent.atomic.AtomicInteger;

public class Substance extends Subject {
    private String color;
    private int weight;
    private AtomicInteger count = new AtomicInteger(0);

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void setState(int temperature) {
        int currentState = count.incrementAndGet();
        System.out.println("\nState change №" + currentState + ": " + temperature);
        if (temperature <= 0) {
            color = "White";
            weight = 1;
        } else {
            color = "Black";
            weight = 2 * temperature;
        }
        super.setState(temperature);
    }
}
