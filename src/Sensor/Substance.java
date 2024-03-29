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
        System.out.println("\nState change №" + currentState);
        if (temperature <= 0) {
            this.color = "White";
            this.weight = 1;
        } else {
            this.color = "Black";
            this.weight = 2 * temperature;
        }
        super.setState(temperature);
    }

}
