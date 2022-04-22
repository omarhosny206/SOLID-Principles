package srp.example01.satisfaction;

public class InvoicePersistence implements Persistence {
    private Invoice invoice;
    String fileName;

    public InvoicePersistence(Invoice invoice, String fileName) {
        this.invoice = invoice;
        this.fileName = fileName;
    }

    @Override
    public void persist() {
        System.out.println("Invoice persisted to file " + fileName);
    }
}
