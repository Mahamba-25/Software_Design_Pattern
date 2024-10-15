package Command;

public class RemoteControl {
    private Command[] buttons;

    public RemoteControl() {
        buttons = new Command[6];
    }

    public void setCommand(int buttonIndex, Command command) {
        buttons[buttonIndex] = command;
    }

    public void pressButton(int buttonIndex) {
        if (buttons[buttonIndex] != null) {
            buttons[buttonIndex].execute();
        }
    }
}
