package State;

public class StoppedState implements PlayerState {
    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Starting playback from beginning.");
        player.setState(player.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Cannot pause. Player is stopped.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }
}