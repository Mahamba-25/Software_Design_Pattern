public class HighlightRenderEngine implements RenderEngine {
    @Override
    public void render(String documentName) {
        System.out.println("Рендеринг документа с подсветкой: " + documentName);
    }
}
