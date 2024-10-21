package State;

/**
 * The player is in playing state, and it will handle user commands accordingly.
 */
public class PlayingState implements PlayerState {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Already playing.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing playback.");
        player.setState(player.getPausedState());
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback.");
        player.setState(player.getStoppedState());
    }
}
