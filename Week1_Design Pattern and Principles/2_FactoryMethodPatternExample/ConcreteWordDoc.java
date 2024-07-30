public class ConcreteWordDoc implements WordDocument {
    @Override
    public void open() {
       System.out.println("Opening the Word Document");
    }

    @Override
    public void save() {
        System.out.println("Saving the Word Document");
    }
    public void close() {
        System.out.println("Closing the Word Document");
    }
}

