public class RealDocument implements Document {
    private String documentName;

    public RealDocument(String documentName) {
        this.documentName = documentName;
        loadDocument();
    }

    private void loadDocument() {
        System.out.println("Загрузка документа: " + documentName);
    }

    @Override
    public void display() {
        System.out.println("Отображение документа: " + documentName);
    }
}
