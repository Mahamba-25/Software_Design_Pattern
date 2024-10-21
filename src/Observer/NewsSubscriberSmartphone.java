package Observer;

/**
 * Subscriber that only gets notified of "Sport" category news.
 * This represents a user on a smartphone.
 */
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Sport".equals(newsCategory)) {
            System.out.println("Smartphone user received sport news: " + news);
        }
    }
}