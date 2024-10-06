public class ProxyDocument implements Document {
    private String documentName;
    private RealDocument realDocument;

    public ProxyDocument(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(documentName);
        }
        realDocument.display();
    }
}
