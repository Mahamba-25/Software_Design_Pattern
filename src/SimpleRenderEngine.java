public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String documentName) {
        System.out.println("Простой рендеринг документа: " + documentName);
    }
}
