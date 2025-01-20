package application;

public class StandardSensor implements Sensor {
    private int numb;

    public StandardSensor(int numb) {
        this.numb = numb;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return numb;
    }
}
