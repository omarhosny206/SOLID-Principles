package srp.example01.satisfaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 42);
        Invoice invoice = new Invoice(book, 1, 0.2, 0.15);

        Calculator invoiceCalculator = new InvoiceCalculator(invoice);
        Printer invoicePrinter = new InvoicePrinter(invoice, invoiceCalculator);
        Persistence invoicePersistence = new InvoicePersistence(invoice, "Invoices.txt");

        invoicePrinter.print();
        invoicePersistence.persist();
    }
}
