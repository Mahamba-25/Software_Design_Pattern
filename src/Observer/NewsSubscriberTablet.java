package Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        System.out.println("Tablet user received all news: " + news);
    }
}
