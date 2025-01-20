package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on = false;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;

    }

    @Override
    public void setOff() {
        on = false;

    }

    @Override
    public int read() {
        if (!on) {
            throw new IllegalStateException();
        }
        int min = -30;
        int max = 30;
        Random temp = new Random();
        return temp.nextInt(max - min + 1) + min;
    }
}
