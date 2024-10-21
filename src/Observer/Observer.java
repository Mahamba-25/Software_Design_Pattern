package Observer;

/**
 * Observer interface, which defines the update method for subscribers.
 */
public interface Observer {
    void update(String newsCategory, String news);
}