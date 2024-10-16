package Mediator;

import java.util.HashMap;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator {
    private final Map<String, String> sensorData = new HashMap<>();

    @Override
    public void collectData(Sensor sensor, String data) {
        sensorData.put(sensor.getClass().getSimpleName(), data);
    }

    @Override
    public void printReport() {
        System.out.println("Отчет по сенсорам:");
        sensorData.forEach((sensor, data) -> System.out.println(sensor + ": " + data));
    }
}