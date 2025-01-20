package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:

        AverageSensor ka = new AverageSensor();
        TemperatureSensor sensor1 = new TemperatureSensor();
        TemperatureSensor sensor2 = new TemperatureSensor();
        ka.addSensor(sensor1);
        ka.addSensor(sensor2);
        System.out.println(ka.isOn());

    }

}
