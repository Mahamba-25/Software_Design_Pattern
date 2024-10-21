package Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Sport".equals(newsCategory)) {
            System.out.println("Smartphone user received sport news: " + news);
        }
    }
}