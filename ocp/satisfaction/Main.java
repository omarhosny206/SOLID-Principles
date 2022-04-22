package ocp.satisfaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 42);
        Invoice invoice = new Invoice(book, 1, 0.2, 0.15);

        InvoicePersistence filePersistence = new FilePersistence("Invoices.txt");
        InvoicePersistence databasePersistence = new DatabasePersistence("Invoices.db");

        PersistenceService filePersistenceService = new PersistenceService(filePersistence);
        filePersistenceService.persist(invoice);

        PersistenceService databasePersistenceService = new PersistenceService(databasePersistence);
        databasePersistenceService.persist(invoice);
    }
}
