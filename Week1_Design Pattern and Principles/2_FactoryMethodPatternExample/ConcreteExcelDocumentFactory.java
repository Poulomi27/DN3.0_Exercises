// ExcelDocumentFactory.java
public class ConcreteExcelDocumentFactory extends ExcelDocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new ConcreteExcelDocument();
    }
}
