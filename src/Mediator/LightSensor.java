package Mediator;

public class LightSensor implements Sensor {
    private final HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        mediator.collectData(this, "Освещенность: 300 люкс");
    }
}