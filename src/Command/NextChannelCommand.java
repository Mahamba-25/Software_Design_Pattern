package Command;

public class NextChannelCommand implements Command {
    private final Television tv;

    public NextChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }
}
