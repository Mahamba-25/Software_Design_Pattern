package State;

public class PausedState implements PlayerState {
    private Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Resuming playback.");
        player.setState(player.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback.");
        player.setState(player.getStoppedState());
    }
}
