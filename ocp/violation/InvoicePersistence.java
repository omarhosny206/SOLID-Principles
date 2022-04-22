package ocp.violation;

public class InvoicePersistence {
    private final Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void persistToFile(String fileName) {
        System.out.println("Invoice is persisted to file " + fileName);
    }

    public void persistToDatabase(String databaseName) {
        System.out.println("Invoice is persisted to database " + databaseName);
    }
}
