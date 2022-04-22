package ocp.violation;


public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 42);
        Invoice invoice = new Invoice(book, 1, 0.2, 0.15);

        InvoicePersistence invoicePersistence = new InvoicePersistence(invoice);

        invoicePersistence.persistToFile("Invoices.txt");
        invoicePersistence.persistToDatabase("Invoices.db");
    }
}
