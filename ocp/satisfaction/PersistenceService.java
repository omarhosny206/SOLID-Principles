package ocp.satisfaction;

public class PersistenceService {
    InvoicePersistence invoicePersistence;

    public PersistenceService(InvoicePersistence invoicePersistence) {
        this.invoicePersistence = invoicePersistence;
    }

    public void persist(Invoice invoice) {
        invoicePersistence.persist(invoice);
    }
}
