public class WatermarkedDocument implements Document {
    private Document document;

    public WatermarkedDocument(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
        addWatermark();
    }

    private void addWatermark() {
        System.out.println("Добавление водяного знака к документу.");
    }
}
