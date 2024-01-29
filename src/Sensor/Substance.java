package Sensor;

public class Substance extends Subject {
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void setState(int temperature) {
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
