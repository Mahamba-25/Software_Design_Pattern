package Observer;

/**
 * Subscriber that only gets notified of "Science" category news.
 * This represents a user on a laptop.
 */
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Science".equals(newsCategory)) {
            System.out.println("Laptop user received science news: " + news);
        }
    }
}