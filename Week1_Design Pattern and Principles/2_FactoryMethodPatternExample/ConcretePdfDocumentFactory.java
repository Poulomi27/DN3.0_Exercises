// PdfDocumentFactory.java
public class ConcretePdfDocumentFactory extends PdfDocumentFactory {
    @Override
    public PdfDocument createDocument() {
        return new ConcretePdfDocument();
    }
}

