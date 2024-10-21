package Observer;

/**
 * NewsPublisher interface to manage subscribers and news publication.
 */
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void publishNews(String category, String news);
}