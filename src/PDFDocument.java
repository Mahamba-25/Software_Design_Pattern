public class PDFDocument implements Document {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Отображение PDF документа: " + fileName);
    }
}
