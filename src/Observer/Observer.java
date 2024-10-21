package Observer;

/**
 * Observer interface for the Observer pattern.
 * This defines the method for subscribers to get updates when news is published.
 */
public interface Observer {
    void update(String newsCategory, String news);
}