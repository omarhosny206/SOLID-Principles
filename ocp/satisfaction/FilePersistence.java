package ocp.satisfaction;

public class FilePersistence implements InvoicePersistence {
    private final String fileName;

    public FilePersistence(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void persist(Invoice invoice) {
        System.out.println("Invoice persisted to file " + fileName);
    }
}
