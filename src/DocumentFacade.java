public class DocumentFacade {
    public void displayDocument(String name) {
        Document document = new ProxyDocument(name);
        document.display();
    }

    public void displayDocumentWithWatermark(String name) {
        Document document = new ProxyDocument(name);
        Document watermarkedDocument = new WatermarkedDocument(document);
        watermarkedDocument.display();
    }

    public void renderDocument(String name, RenderEngine engine) {
        engine.render(name);
    }
}
