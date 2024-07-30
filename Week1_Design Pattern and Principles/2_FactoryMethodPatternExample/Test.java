// Main.java
public class Test {
    public static void main(String[] args) {
        WordDocumentFactory wordFactory = new ConcreteWordDocumentFactory();
        WordDocument wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        System.out.println();

        PdfDocumentFactory pdfFactory = new ConcretePdfDocumentFactory();
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
        System.out.println();

        ExcelDocumentFactory excelFactory = new ConcreteExcelDocumentFactory();
        ExcelDocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
        System.out.println();
    }
}
