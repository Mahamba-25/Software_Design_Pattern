package Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of NewsPublisher.
 * Manages a list of subscribers and notifies them when news is published.
 */
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void publishNews(String category, String news) {
        for (Observer observer : subscribers) {
            observer.update(category, news);
        }
    }
}