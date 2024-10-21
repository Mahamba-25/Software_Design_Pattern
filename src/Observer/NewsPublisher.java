package Observer;

/**
 * NewsPublisher interface that manages subscribers and news publication.
 */
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void publishNews(String category, String news);
}