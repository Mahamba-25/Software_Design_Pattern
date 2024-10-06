import java.util.HashMap;
import java.util.Map;

public class DocumentFactory {
    private static Map<String, Document> documentMap = new HashMap<>();

    public static Document getDocument(String name) {
        Document document = documentMap.get(name);
        if (document == null) {
            document = new RealDocument(name);
            documentMap.put(name, document);
        }
        return document;
    }
}
