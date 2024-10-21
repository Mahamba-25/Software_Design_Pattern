package Observer;

/**
 * Subscriber that receives all news, regardless of category.
 * This represents a user on a tablet.
 */
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        System.out.println("Tablet user received all news: " + news);
    }
}
