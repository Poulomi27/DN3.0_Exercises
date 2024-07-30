// WordDocumentFactory.java
public class ConcreteWordDocumentFactory extends WordDocumentFactory {
    @Override
    public WordDocument createDocument() {
        return new ConcreteWordDoc();
    }
}


