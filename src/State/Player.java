package State;

public class Player {
    private PlayerState playingState;
    private PlayerState pausedState;
    private PlayerState stoppedState;

    private PlayerState state;

    public Player() {
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);

        state = stoppedState;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public PlayerState getPlayingState() {
        return playingState;
    }

    public PlayerState getPausedState() {
        return pausedState;
    }

    public PlayerState getStoppedState() {
        return stoppedState;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }
}
