package Command;

public class PreviousChannelCommand implements Command {
    private final Television tv;

    public PreviousChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}