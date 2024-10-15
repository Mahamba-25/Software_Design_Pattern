package Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        mediator.collectData(this, "Температура: 22°C");
    }
}