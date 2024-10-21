package State;

/**
 * Interface representing different states of the media player.
 * Defines the behavior of the player in different states (Playing, Paused, Stopped).
 */
public interface PlayerState {
    void play();
    void pause();
    void stop();
}
