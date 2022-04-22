package ocp.satisfaction;

public class DatabasePersistence implements InvoicePersistence {
    private final String databaseName;

    public DatabasePersistence(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void persist(Invoice invoice) {
        System.out.println("Invoice persisted to database " + databaseName);

    }
}
