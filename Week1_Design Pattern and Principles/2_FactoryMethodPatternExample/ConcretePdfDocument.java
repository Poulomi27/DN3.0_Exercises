public class ConcretePdfDocument implements PdfDocument{
    @Override
    public void open() {
       System.out.println("Opening the Pdf Document");
    }
    @Override
    public void save() {
        System.out.println("Saving the Pdf Document");
    }
    public void close() {
        System.out.println("Closing the Pdf Document");
    }
}
