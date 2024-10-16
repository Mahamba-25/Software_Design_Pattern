package Mediator;

public class HumiditySensor implements Sensor {
    private final HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        mediator.collectData(this, "Влажность: 60%");
    }
}