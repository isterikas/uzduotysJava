package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();


    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        if (!sensors.isEmpty()) {
            sensors.forEach(Sensor::setOff);
        }

    }

    @Override
    public int read() {
        int sum = sensors.stream().mapToInt(Sensor::read).sum();
        readings.add(sum / sensors.size());
        return sum / sensors.size();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }
}
